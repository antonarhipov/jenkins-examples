pipline {
    agent any
    stages {
        stage('Compile') {
            stage {
                steps {
                    echo "Compile"
                }
            }
        }
        stage('Integration Tests') {
            stages {
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
        }
        stage('Packaging') {
            stages {
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
        }
        stage('More testing') {
            stages {
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
        }
        stage('Deploy'){
            steps {
                echo 'Deploy'
            }
        }

    }
}