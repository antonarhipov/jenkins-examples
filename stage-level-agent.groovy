pipeline {
    agent none 
    stages {
        stage('Example Build') {
            agent {
                docker {
                    label 'third'
                    image 'maven:3-alpine'
                }
            }
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
        }
        stage('Example Test') {
            agent {
                docker {
                    label 'secondary'
                    image 'openjdk:8-jre'
                }
            }
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
                stage('Example-5'){
                    steps {
                        sh 'echo CCC >> file.txt'
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
