pipeline {
    agent any
 
 
  
    stages {
        stage('Checkout and Clone') {
            steps {
                script {
                    def repositoryUrl = 'https://github.com/dothmen/jenkinstes.git'
 
                    checkout([$class: 'GitSCM', 
                        branches: [[name: 'main']], 
                        doGenerateSubmoduleConfigurations: false, 
                        extensions: [[$class: 'CloneOption', depth: 1]], 
                        userRemoteConfigs: [[url: repositoryUrl]]])
                }
            }
        }
            stage('Build') {
            steps {
                 bat "mvn install"
            }
                }
                stage('verify') {
            steps {
                 bat "mvn verify"
            }
                }
}
}

 