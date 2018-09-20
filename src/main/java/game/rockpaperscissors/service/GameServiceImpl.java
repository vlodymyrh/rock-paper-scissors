package game.rockpaperscissors.service;

import game.rockpaperscissors.constants.Result;
import game.rockpaperscissors.constants.ShapeForm;
import game.rockpaperscissors.domain.Round;

public class GameServiceImpl implements GameService {
    @Override
    public Round playRound() {
        ShapeForm shapeFormPlayer1 = ShapeForm.ROCK;
        ShapeForm shapeFormPlayer2 = generateShapeForm();

        return getGameResult(shapeFormPlayer1, shapeFormPlayer2);
    }

    private ShapeForm generateShapeForm() {
        ShapeGeneratorService shapeGeneratorService = new ShapeGeneratorServiceImpl();
        return shapeGeneratorService.generate();
    }

    //TODO: Extract to oracle service and think up a new algorithm
    private Round getGameResult(ShapeForm shapeFormPlayer1, ShapeForm shapeFormPlayer2) {
        Round round = new Round();

        round.setShapeFormPlayer1(shapeFormPlayer1);
        round.setShapeFormPlayer2(shapeFormPlayer2);
        int decimalValuePlayer1 = shapeFormPlayer1.getDecimalValue();
        int decimalValuePlayer2 = shapeFormPlayer2.getDecimalValue();

        int result = Math.round(((float)decimalValuePlayer1 / (float)decimalValuePlayer2) * 10);

        switch (result) {
            case(10) : // (1 / 1) * 10 = 10
                round.setResult(Result.DRAWN);
                break;
            case(5) : // (1 / 2) * 10 = 5
                round.setResult(Result.PLAYER2_WIN);
                break;
            case(3) : // (1 / 3) * 10 = 3.333333333333
                round.setResult(Result.PLAYER1_WIN);
                break;
            case(20) : // (2 / 1) * 10 = 20
                round.setResult(Result.PLAYER1_WIN);
                break;
            case(7) : // (2 / 3) * 10 = 6.666666666666
                round.setResult(Result.PLAYER2_WIN);
                break;
            case(30) : // (3 / 1) * 10 = 30
                round.setResult(Result.PLAYER2_WIN);
                break;
            case(15) : // (3 / 2) * 10 = 15
                round.setResult(Result.PLAYER1_WIN);
                break;
            default:
                break;
        }
        return round;
    }
}
