#!/usr/bin/env groovy

// testDeploy.groovy

def call(body) {
    echo "Start test teploy"

    new testDeploy(script:this).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS'

    return this
}
