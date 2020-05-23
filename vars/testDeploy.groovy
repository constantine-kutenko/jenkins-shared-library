#!/usr/bin/env groovy

// testDeploy.groovy

def call(body) {
    echo "Start test deploy"

    new Deployment(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS'

    return this
}
