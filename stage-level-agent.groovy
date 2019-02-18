pipeline {
    agent none 
    stages {
        stage('Example Build') {
            agent { docker 'maven:3-alpine' } 
            stages {
                stage('Example-1'){
                    steps {
                        echo 'Hello, Maven'
                        sh 'mvn --version'
                    }
                }
                stage('Example-2'){
                    steps {
                        sh 'echo AAA >> file.txt'
                        stash includes: 'file.txt', name: 'app'
                    }
                }
            }
            post {
                always {
                    archiveArtifacts artifacts: '*.txt', fingerprint: true
                }
            }
        }
        stage('Example Test') {
            agent { docker 'openjdk:8-jre' } 
            stages {
                stage('Example-3'){
                    steps {
                        echo 'Hello, JDK'
                        sh 'java -version'
                    }
                }
                stage('Example-4'){
                    steps {
                        unstash 'app'
                        sh 'echo BBB >> file.txt'
                    }
                }
            }
            post {
                always {
                    archiveArtifacts artifacts: '*.txt', fingerprint: true
                }
            }
        }
    }
}
