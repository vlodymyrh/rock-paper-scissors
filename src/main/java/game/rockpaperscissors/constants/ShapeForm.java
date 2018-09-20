package game.rockpaperscissors.constants;

public enum ShapeForm {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int decimalValue;

    ShapeForm(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public int getDecimalValue(){
        return this.decimalValue;
    }

    public static ShapeForm getByDecimal(int decimalValue) throws IllegalArgumentException {
        for ( ShapeForm shapeForm : ShapeForm.values()) {
            if (shapeForm.decimalValue == decimalValue) {
                return shapeForm;
            }
        }
        throw new IllegalArgumentException();
    }
}
