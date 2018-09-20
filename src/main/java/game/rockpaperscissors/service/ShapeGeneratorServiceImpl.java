package game.rockpaperscissors.service;

import game.rockpaperscissors.constants.ShapeForm;

import java.util.Random;

public class ShapeGeneratorServiceImpl implements ShapeGeneratorService {
    private static final int MIN = 1;
    private static final int MAX = 3;

    @Override
    public ShapeForm generate() {
        int number = getRandomNumberInRange(MIN, MAX);
        return ShapeForm.getByDecimal(number);
    }

    private int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
}
