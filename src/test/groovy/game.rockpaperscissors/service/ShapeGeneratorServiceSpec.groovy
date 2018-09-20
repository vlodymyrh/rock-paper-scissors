import spock.lang.Specification

class ShapeGeneratorServiceSpec extends Specification {

    def "should return random shape"() {
        setup: "Generator service"
        def generatorService = new ShapeGeneratorService()

        when: "Generates shake"
        def shape = generatorService.generate()

        then: "Shake is from ShakeForm enum"
        assert ShakeForm.values().contains(shape) == true
    }
}
