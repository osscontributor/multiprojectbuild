package mathhelper

import grails.plugins.*

class MathhelperGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.0.1 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Mathhelper" // Headline display name of the plugin
    def author = "Your name"
    def authorEmail = ""
    def description = '''\
Brief summary/description of the plugin.
'''
    def profiles = ['web']

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/mathhelper"

    Closure doWithSpring() { {->
            multiplicationHelper(MultiplicationHelper) {
                multiplier = config.mathhelper.multiplication.multiplier ?: 2
            }
        }
    }
}
