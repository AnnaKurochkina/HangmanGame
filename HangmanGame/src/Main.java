
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        while (true) {
            Game game = new Game();
            game.play();
            if (!userInput.captureYesNo("Do you want to play again? (y/n)")) {
                return;
            }
        }
    }
}