pipeline {
    agent any

    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk11'
    }

    stages {
        stage('Code Analysis') {
            steps {
                bat '''
                mvn clean verify spotbugs:spotbugs
                '''
            }
        }
        stage('Unit Test') {
            steps {
                bat '''
                mvn test
                '''
            }
        }
        stage('Build JAR') {
            steps {
                bat '''
                mvn package
                '''
            }
        }
        stage('Deploy') {
            steps {
                bat '''
                mvn deploy
                '''
            }
        }
    }
}
