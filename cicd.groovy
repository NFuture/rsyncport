node('linux') 
{
        stage('Build') {
                build job: 'Port-Pipeline', parameters: [string(name: 'REPO', value: 'rsyncport'), string(name: 'DESCRIPTION', 'rsyncport' )]
        }
}
