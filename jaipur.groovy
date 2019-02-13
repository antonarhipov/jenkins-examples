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

        stage('TeamCity Stage 2') {
            steps {
                echo "TC Stage 1"
            }
        }


        stage('TeamCity Parallel Stage Second') {
            parallel {
                stage('TeamCity Parallel Stage Second 1') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage Second 2 - with nesting') {
                    parallel {
                        stage('TeamCity Parallel Nested Stage 1') {
                            steps {
                                echo "TC P Stage 1"
                            }
                        }
                        stage('TeamCity Parallel Nested Stage 2') {
                            steps {
                                echo "TC P Stage 1"
                            }
                        }
                        stage('TeamCity Parallel Nested Stage 3 - mwahaha') {
                            parallel {
                                stage('TeamCity Parallel Nested Stage 1 - mwahaha') {
                                    steps {
                                        echo "TC P Stage 1"
                                    }
                                }
                                stage('TeamCity Parallel Nested Stage 2 - mwahaha') {
                                    steps {
                                        echo "TC P Stage 1"
                                    }
                                }
                                stage('TeamCity Parallel Nested Stage 3 - mwahaha') {
                                    steps {
                                        echo "TC P Stage 1"
                                    }
                                }
                            }
                        }
                    }
                }
                stage('TeamCity Parallel Stage Second 3') {
                    steps {
                        echo "TC P Stage 1"
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
            steps {
                echo "TC Stage 1"
            }
        }


    }
}