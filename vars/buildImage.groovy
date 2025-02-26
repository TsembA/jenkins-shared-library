#!/user/bin/env groovy

def call(String imageName) {
    echo "Building the docker image...."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        script {
            sh "docker build -t $imageName ."
            sh 'echo $PASS | docker login -u $USER --password-stdin'
            sh "docker push $imageName"
        }
    }
}