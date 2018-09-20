package game.rockpaperscissors.service

import game.rockpaperscissors.constants.ShapeForm

import spock.lang.Specification

class GameServiceSpec extends Specification {

    def shapeGeneratorService = Mock(ShapeGeneratorService.class)

    def "should return round result Drawn"() {
        setup: "Game"
        def gameService = new GameServiceImpl()
        def shape = ShapeForm.ROCK

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Rock"
        1 * shapeGeneratorService.generate() >> shape

        expect: "Drawn result"
        round.getResult().getName() == "Drawn"
    }

    def "should return round result Player1 won"() {
        setup: "Game"
        def gameService = new GameServiceImpl()

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Scissors"
        1 * shapeGeneratorService.generate() >> ShapeForm.SCISSORS

        expect: "Player1 won"
        round.getResult().getName() == "Player1 won"
    }

    def "should return round result Player2 won"() {
        setup: "Game"
        def gameService = new GameServiceImpl()

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Paper"
        1 * shapeGeneratorService.generate() >> ShapeForm.PAPER

        expect: "Player2 won"
        round.getResult().getName() == "Player2 won"
    }
}
