#!/user/bin/env groovy

def call() {
    echo "Building JAR file for branch"
    sh "mvn clean package"
}
return this
