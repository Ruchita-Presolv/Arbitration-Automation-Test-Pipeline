pipeline {
    agent any

    environment {
        JAVA_TOOL_OPTIONS = '--add-exports jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED --add-opens jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED --add-opens jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Ruchita-Presolv/Arbitration-Automation-Test-Pipeline.git', branch: 'feature/lombok-fix'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Test Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
