grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.source.level = 1.6
grails.project.target.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        inherits true
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenCentral()
        mavenRepo "http://repository.codehaus.org"
    }

    dependencies {
        compile('org.hibernate:hibernate-search:3.4.1.Final')
    }

    plugins {
        build(":tomcat:$grailsVersion", ":release:1.0.0.RC3") {
            export = false
        }
    }
}