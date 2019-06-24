# jenkins-shared-library

A test Jenkins shared library for learning purposes

Load the library into a Declarative Pipeline (Jenkinsfile) from `master` branch and use its methods.
Declarative Pipeline does not allow method calls on objects outside "script" blocks. (JENKINS-42360 <https://issues.jenkins-ci.org/browse/JENKINS-42360>). The method calls above would need to be put inside a script directive.

```groovy
@Library('jenkins-shared-library@master') _

pipeline {
    agent any
    stages {
        stage("log") {
            steps {
                script {
                    log.info 'Information'
                    log.warning 'Warning'
                }
            }
        }
    }
}
```

```groovy
@Library('jenkins-shared-library@master') _

evenOrOdd(currentBuild.getNumber())
```
