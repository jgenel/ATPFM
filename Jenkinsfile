pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/jgenel/ATPFM.git', branch: 'main'
            }
        }

        stage('Build and Test') {
            steps {
                dir('automation-testing-repo') { 
                    bat 'mvn -Dtest=RegisterTest test'
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
