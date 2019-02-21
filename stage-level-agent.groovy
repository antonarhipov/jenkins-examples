pipeline {
    agent any
    stages {
        parallel {
            stage('Example Build') {
                steps {
                    sh 'echo AAA >> file.txt'
                }
            }
            stage('Example Test') {
                steps {
                    sh 'echo BBB >> file.txt'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '*.txt', fingerprint: true
        }
    }
}
