#!/user/bin/env groovy

def call() {
    echo "Building JAR file for branch $BRANCH_NAME"
    sh "mvn clean package"
}
return this
