pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'     // Ensure exact match in Global Tool Configuration
        jdk 'Java 11'           // Matches configured JDK (can be Java 11 if that's what you set)
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=true"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Ruchita-Presolv/Arbitration-Automation-Test-Pipeline.git'
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
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'cucumber-html-reports.html',
                    reportName: 'Cucumber Test Report',
                    keepAll: true
                ])
            }
        }

        stage('Archive JUnit Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
    }
}

