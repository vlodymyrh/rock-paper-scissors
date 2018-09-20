package game.rockpaperscissors.service

import game.rockpaperscissors.constants.ShapeForm
import spock.lang.Specification

class ShapeGeneratorServiceSpec extends Specification {

    def "should return random shape"() {
        setup: "Generator service"
        def generatorService = new ShapeGeneratorServiceImpl()

        when: "Generates shake"
        def shape = generatorService.generate()

        then: "Shape is from ShapeForm enum"
        assert ShapeForm.values().contains(shape)
    }
}
