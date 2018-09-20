package game.rockpaperscissors.constants;

public enum Result {

    DRAWN("Drawn"),
    PLAYER1_WIN("Player1 won"),
    PLAYER2_WIN("Player2 won");

    private String name;

    Result(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
