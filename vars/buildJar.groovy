#!/user/bin/env groovy

def call() {
    echo "Building JAR file..."
    sh "mvn clean package"
}
return this
