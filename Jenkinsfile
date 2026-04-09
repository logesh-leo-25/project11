pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t my-java-app:latest .'
            }
        }
        stage('Docker Run') {
            steps {
                sh 'docker run --rm my-java-app:latest'
            }
        }
    }
}
