#!/usr/bin/env groovy

// testDeploy.groovy

@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
import org.apache.commons.lang3.StringUtils

class Deployment {
    int count = 0
    Script Script

    def run() {
        while (count < 10) {
            Thread.sleep(1000)
            count++
            script.echo("Count is: " + StringUtils.isAlphanumeric("" + count))
        }
    }
}
