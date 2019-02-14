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
                stage('TeamCity Parallel Stage 7') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 8') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 9') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 10') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 11') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 12') {
                    steps {
                        echo "TC P Stage 1"
                    }
                } stage('TeamCity Parallel Stage 13') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 14') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 15') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 16') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 17') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 18') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 19') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 20') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 21') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 22') {
                    steps {
                        echo "TC P Stage 1"
                    }
                }
                stage('TeamCity Parallel Stage 23') {
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
                        stage('TeamCity Parallel Stage Second 1 - blah 1') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 2') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 3') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 4') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 5') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 6') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 7') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 8') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 9') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 1 - blah 10') { steps { echo '' } }
                    }
                }
                stage('TeamCity Parallel Stage Second 2') {
                    stages {
                        stage('TeamCity Parallel Stage Second 2 - mlah 1') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 2') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 3') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 4') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 5') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 6') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 7') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 8') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 9') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 10') { steps { echo '' } }
                        stage('TeamCity Parallel Stage Second 2 - mlah 11') { steps { echo '' } }
                    }
                }
                stage('TeamCity Parallel Stage Second 3') {
                    stages {
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  1') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  2') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  3') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  4') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  5') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  6') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  7') {
                            steps { echo '' }
                        }
                        stage('TeamCity Parallel Stage Second 3 - quuxblasdfasdffasdfdf asdfdfsdfdiuweriyusdf sqiwieruyqweiorqyiweryoqw  8') {
                            steps { echo '' }
                        }
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