package game.rockpaperscissors.domain;

import game.rockpaperscissors.constants.Result;
import game.rockpaperscissors.constants.ShapeForm;

public class Round {

    private Result result;
    private ShapeForm shapeFormPlayer1;
    private ShapeForm shapeFormPlayer2;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ShapeForm getShapeFormPlayer1() {
        return shapeFormPlayer1;
    }

    public void setShapeFormPlayer1(ShapeForm shapeFormPlayer1) {
        this.shapeFormPlayer1 = shapeFormPlayer1;
    }

    public ShapeForm getShapeFormPlayer2() {
        return shapeFormPlayer2;
    }

    public void setShapeFormPlayer2(ShapeForm shapeFormPlayer2) {
        this.shapeFormPlayer2 = shapeFormPlayer2;
    }
}
