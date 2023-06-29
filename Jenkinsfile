pipeline {
    agent any

    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk11'
    }

    stages {
        stage('Code Analysis') {
            steps {
                sh '''
                bat '''
                mvn clean verify sonar:sonar
                '''
            }
        }
        stage('Unit Test') {
            steps {
                sh '''
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
                sh '''
                bat '''
                mvn deploy
                '''
            }
        }
    }
}
