# jenkins-shared-library

A test Jenkins shared library for learning purposes

Load the library into a Pipeline (Jenkinsfile) from `master` branch and use its methods:

```groovy
@Library('jenkins-shared-library@master') _

log.info 'Information'
log.warning 'Warning'
```
