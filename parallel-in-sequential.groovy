pipeline {
    agent none 
    stages {
        stage('Stage 1') {
            agent { docker 'maven:3-alpine' } 
            steps {
                echo 'Hello, Maven'
            }
        }
        stage('Example Test') {
            agent { docker 'openjdk:8-jre' } 
            stages {
                stage('In Sequential 1') {
                    steps {
                        echo "In Sequential 1"
                    }
                }
                stage('In Sequential 2') {
                    steps {
                        echo "In Sequential 2"
                    }
                }
                stage('Parallel In Sequential') {
                    parallel {
                        stage('In Parallel 1') {
                            steps {
                                echo "In Parallel 1"
                            }
                        }
                        stage('In Parallel 2') {
                            steps {
                                echo "In Parallel 2"
                            }
                        }
                    }
                }
            }
        }
    }
}



