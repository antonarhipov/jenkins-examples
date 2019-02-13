pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                echo "Compile"
            }
        }
        stage('Integration Tests') {
                parallel {
                    for (int i = 0; i < 10; i++) {
                        stage("Integration Tests / Stage ${i}") {
                            steps {
                                echo 'Integration testing ${i}'
                            }
                        }
                    }
                }
        }
        stage('Packaging') {
                parallel {
                    for (int i = 0; i < 5; i++) {
                        stage("Packaing / Stage ${i}") {
                            steps {
                                echo 'Packaing ${i}'
                            }
                        }
                    }
                }
        }
        stage('More testing') {
                parallel {
                    int x = 20
                    for (int i = 0; i < x; i++) {
                        stage("More Testing Stuff / Stage ${i} of ${x}") {
                            steps {
                                echo 'More testing ${i}'
                            }
                        }
                    }
                }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }

    }
}