pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello, Maven'
            }
        }
        stage('Stage 2') {
            stage('Stage 2-1') {
                steps {
                    echo 'Hello, 2-1'
                }
            }
            stage('Stage 2-2') {
                steps {
                    echo 'Hello, 2-2'
                }
            }
        }
    }
}


