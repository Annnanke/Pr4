pipeline {
    agent any

    tools {
        maven 'Maven 3.9.3'
        jdk 'jdk17'
    }

    stages {
        stage('Code Analysis') {
            steps {
                sh '''
                mvn clean verify sonar:sonar
                '''
            }
        }
        stage('Unit Test') {
            steps {
                sh '''
                mvn test
                '''
            }
        }
        stage('Build JAR') {
            steps {
                sh '''
                mvn package
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                mvn deploy
                '''
            }
        }
    }
}
