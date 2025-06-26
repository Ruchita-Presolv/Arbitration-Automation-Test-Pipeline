pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'     // Make sure this name matches exactly what you added under "Global Tool Configuration"
        jdk 'Java 17'           // Set to 'Java 17' if that's what you named it (or keep as 'Java 11' if you didn't rename)
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=true"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Ruchita-Presolv/Arbitration-Automation-Test-Pipeline.git'
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
