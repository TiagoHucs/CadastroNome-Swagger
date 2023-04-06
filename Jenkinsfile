pipeline {
    agent any
    
    stages {
        stage('Testes Unitários') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
