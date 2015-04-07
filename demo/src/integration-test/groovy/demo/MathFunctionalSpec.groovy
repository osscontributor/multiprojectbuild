package demo

import grails.test.mixin.integration.Integration

import geb.spock.*

@Integration
class MathFunctionalSpec extends GebSpec {

    void "Test the home page renders correctly"() {
        when:
        go '/multiply/42'

        then:
        $().text() == 'The result is 84'
    }
}
