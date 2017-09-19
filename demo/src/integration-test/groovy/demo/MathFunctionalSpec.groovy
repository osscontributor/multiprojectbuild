package demo


import geb.spock.*
import grails.testing.mixin.integration.Integration

@Integration
class MathFunctionalSpec extends GebSpec {

    void "Test the home page renders correctly"() {
        when:
        go '/multiply/42'

        then:
        $().text() == 'The result is 126'
    }
}
