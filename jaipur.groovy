pipeline {
    agent any
    stages {
        stage('Start') {
            steps {
                echo "Hello 1"
            }
        }

        stage('TeamCity Parallel Stage / First Time') {
            parallel {
                stage('TeamCity Parallel Stage 1') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 2') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 3') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 4') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 5') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 6') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
            }
        }

        stage('TeamCity Stage 2') {
            steps {
                echo "TC Stage 1"
            }
        }

        stage('TeamCity Stage 3') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Parallel Stage Second') {
            parallel {
                stage('TeamCity Parallel Stage Second 1') {
                    stages {
                        stage('blah 1') {}
                        stage('blah 2') {}
                        stage('blah 3') {}
                        stage('blah 4') {}
                        stage('blah 5') {}
                    }
                }
                stage('TeamCity Parallel Stage Second 2 - with nesting') {
                    stages {
                        stage('mlah 1') {}
                        stage('mlah 2') {}
                        stage('mlah 3') {}
                        stage('mlah 4') {}
                        stage('mlah 5') {}
                    }
                }
                stage('TeamCity Parallel Stage Second 3') {
                    stages {
                        stage('quux 1') {}
                        stage('quux 2') {}
                        stage('quux 3') {}
                        stage('quux 4') {}
                        stage('quux 5') {}
                    }
                }
            }
        }


        stage('TeamCity Stage 4') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 5') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 6') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 7') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 8') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 9') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Stage 10') {
            stages {
                stage('TC - 10, 1') {
                    steps {
                        echo 'blah'
                    }
                }
                stage('TC - 10, 2') {
                    steps {
                        echo 'blah'
                    }
                }
                stage('TC - 10, 3') {
                    steps {
                        echo 'blah'
                    }
                }
                stage('TC - 10, 4') {
                    parallel {
                        stage('TC - zzz, 1') {
                            steps {
                                echo 'blah'
                            }
                        }
                        stage('TC - zzz, 2') {
                            steps {
                                echo 'blah'
                            }
                        }
                        stage('TC - zzz, 3') {
                            steps {
                                echo 'blah'
                            }
                        }
                        stage('TC - zzz, 4') {
                            steps {
                                echo 'blah'
                            }
                        }
                    }
                }
                stage('TC - 10, 5') {
                    steps {
                        echo 'blah'
                    }
                }
            }
        }

        stage('TeamCity Stage 11') {
            steps {
                echo "TC Stage 1"
            }
        }


    }
}