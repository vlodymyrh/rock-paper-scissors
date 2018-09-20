
import spock.lang.Specification

class GameServiceSpec extends Specification {

    def shapeGeneratorService = Mock(ShapeGeneratorService)

    def "should return round result Drawn"() {
        setup: "Game"
        def gameService = new GameService()

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Rock"
        1 * shapeGeneratorService.generate() >> ShakeForm.Rock

        expect: "Drawn result"
        round.getResult().getName().equals("Drawn")
    }

    def "should return round result Player1 win"() {
        setup: "Game"
        def gameService = new GameService()

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Scissors"
        1 * shapeGeneratorService.generate() >> ShakeForm.Scissors

        expect: "Player1 win"
        round.getResult().getName().equals("Player1 win")
    }

    def "should return round result Player2 win"() {
        setup: "Game"
        def gameService = new GameService()

        when: "Play"
        def round = gameService.playRound()

        then: "Second player shape is Paper"
        1 * shapeGeneratorService.generate() >> ShakeForm.Paper

        expect: "Player2 win"
        round.getResult().getName().equals("Player2 win")
    }
}
