#!/user/bin/env groovy

def call() {
    echo "Building the docker image...."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        script {
            sh "docker build -t dancedevops/my-app:jma-1.2.3 -f Dockerfile ."
            sh 'echo $PASS | docker login -u $USER --password-stdin'
            sh "docker push dancedevops/my-app:jma-1.2.3"
        }
    }
}