# 🧰 Jenkins Shared Library – Study Notes

This repository contains a custom **Jenkins Shared Library** project. It's designed to help modularize and reuse Jenkins pipeline code across multiple projects using the **Groovy DSL**.

---

## 📌 What is a Jenkins Shared Library?

A **shared library** in Jenkins is a way to centralize pipeline logic into reusable functions, classes, and variables. Instead of duplicating code in every Jenkinsfile, you define shared logic once and call it wherever needed.

---

## 📁 Project Structure

```
jenkins-shared-library/
├── README.md               # 📘 Project overview and usage
├── vars/                   # 🔧 Global variables/functions accessible in pipelines
│   └── buildImage.groovy   # 📦 Function to build Docker image
│   └── dockerLogin.groovy  # 🔐 Function to login to Docker Hub
│   └── dockerPush.groovy   # 🚀 Function to push Docker image
├── src/                    # 📚 Groovy classes (optional for advanced logic)
├── resources/              # 🗂️ Static files (e.g., email templates)
└── script.groovy           # 🧪 Custom logic to be loaded in pipelines
```

---

## ✅ Key Features

- 🛠 Reusable functions like `buildImage`, `dockerLogin`, `dockerPush`
- 📂 Centralized logic for managing CI/CD stages
- 📦 Easy Docker integration
- 🧪 Supports loading additional scripts like `script.groovy` from pipeline

---

## 🧪 Example Pipeline Usage

In your Jenkinsfile (declarative syntax):

```groovy
@Library('jenkins-shared-library')_

pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        script {
          buildImage('your-image-name')
        }
      }
    }
    // More stages ...
  }
}
```

---

## 🧠 Why Use This?

- DRY (Don’t Repeat Yourself): Avoid duplicating code across Jenkinsfiles
- Cleaner pipelines: Less clutter, more readability
- Scalable: Easily maintain multiple pipelines across many repos

---
