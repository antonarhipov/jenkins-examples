pipeline {
    agent { docker 'maven:3-alpine' } 
    stages {
        stage('Example Build') {
            steps {
                echo 'mvn -B clean verify'
            }
        }
    }
}
