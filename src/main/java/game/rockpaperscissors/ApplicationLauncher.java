package game.rockpaperscissors;

import game.rockpaperscissors.domain.Round;
import game.rockpaperscissors.service.GameService;
import game.rockpaperscissors.service.GameServiceImpl;

import java.util.stream.IntStream;

public class ApplicationLauncher {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();

        IntStream.range(0, 100)
                .forEach(i -> {
                    Round round = gameService.playRound();
                    System.out.println("Round " + i);
                    System.out.println("Player 1 shape: " + round.getShapeFormPlayer1());
                    System.out.println("Player 2 shape: " + round.getShapeFormPlayer2());
                    System.out.println("Result: " + round.getResult().getName());
                });
    }
}
