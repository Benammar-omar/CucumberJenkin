pipeline {
    agent any
 
 
  
    stages {
        stage('Checkout and Clone') {
            steps {
                script {
                    def repositoryUrl = 'https://github.com/Benammar-omar/CucumberJenkin.git'
 
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
                      stage('test') {
            steps {
                 bat "mvn test"
            }
   post {
    always {
        cucumber buildStatus: 'UNSTABLE',
                failedFeaturesNumber: 1,
                failedScenariosNumber: 1,
                skippedStepsNumber: 1,
                failedStepsNumber: 1,
                classifications: [
                        [key: 'Commit', value: '<a href="${GERRIT_CHANGE_URL}">${GERRIT_PATCHSET_REVISION}</a>'],
                        [key: 'Submitter', value: '${GERRIT_PATCHSET_UPLOADER_NAME}']
                ],
                reportTitle: 'My report',
                fileIncludePattern: '**/*cucumber-report.json',
                sortingMethod: 'ALPHABETICAL',
                trendsLimit: 100
    }
}
 
                }
}
}

 