pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'
        jdk 'Java 11'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Ruchita-Presolv/Arbitration-Automation-Test-Pipeline.git', branch: 'main'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('Publish Reports') {
            steps {
                publishHTML(target: [
                    reportDir: 'target/cucumber-html-reports',
                    reportFiles: 'overview-features.html',
                    reportName: 'Cucumber Test Report',
                    keepAll: true
                ])
            }
        }

        stage('Archive JUnit Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
