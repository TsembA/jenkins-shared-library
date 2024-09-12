#!/user/bin/env groovy


def call () {
    def buildImage() {
    echo 'build and push image...'
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t tsemb/demo-app:jma-6.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push tsemb/demo-app:jma-6.0 '
    }

}
}