import java.util.ArrayList;

public class Game {

    String targetWordString;
    char[] targetWord;
    char[] wordToGuess;
    ArrayList<Character> alreadyGuessed;
    int lives;
    UserInput userInput = new UserInput();

    public Game() {
        Words words = new Words();

        targetWordString = words.getRandomWord();
        targetWord = targetWordString.toCharArray();
        wordToGuess = new char[targetWord.length];
        for (int i = 0; i < targetWord.length; i++) {
            wordToGuess[i] = '_';
        }
        alreadyGuessed = new ArrayList<Character>();
        lives = 9;
    }

    String stringToGuess() {
        String toGuess = "";
        for (int i = 0; i < wordToGuess.length; i++) {
            toGuess += wordToGuess[i] + " ";
        }
        return toGuess;
    }

    boolean checkGuess(char letter) {
        boolean foundOne = false;
        for (int i = 0; i < targetWord.length; i++) {
            if (letter == targetWord[i]) {
                foundOne = true;
                wordToGuess[i] = letter;
            }
        }
        return foundOne;
    }

    boolean areBlanksLeft() {
        for (int i = 0; i < wordToGuess.length; i++) {
            if (wordToGuess[i] == '_') {
                return true;
            }
        }
        return false;
    }

    public void play() {

        while (true) {
            System.out.println("Word to guess: " + stringToGuess());
//            System.out.println("Cheat mode: " + targetWordString);
            char guessedLetter = userInput.captureSingleCharAsLowerCase("Guess a letter: ");

            if (alreadyGuessed.contains(guessedLetter)) {
                System.out.println("You already guessed: " + guessedLetter + "'. Pick another letter.");
                continue;
            }

            alreadyGuessed.add(guessedLetter);
            boolean foundLetter = checkGuess(guessedLetter);
            if (foundLetter) {
                boolean blanksLeft = areBlanksLeft();
                if (!blanksLeft) {
                    System.out.println("You won! The word is: " + targetWordString + "\nYou figured out the word in "
                            + alreadyGuessed.size() + " guesses, and had " + lives + " lives left.");

                    return;
                }
            } else {
                lives = lives - 1;
                System.out.println("The word doesn't have: " + guessedLetter);
                DisplayHangman displayHangman = new DisplayHangman();
                displayHangman.getHangman(lives);
                if (lives <= 0) {
                    System.out.println("No more lives remaining. The word was: " + new String(targetWord));
                    return;
                }
                System.out.println("You have: " + lives + " lives left.");
            }
        }
    }
}
