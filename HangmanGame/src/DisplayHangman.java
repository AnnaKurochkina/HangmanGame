public class DisplayHangman {

    public void getHangman(int lives) {

        if (lives == 8) {
            System.out.println("");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 7) {
            System.out.println("");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 6) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 5) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 4) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |        |");
            System.out.println("  |        |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 3) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |        |");
            System.out.println("  |       /|");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 2) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |        |");
            System.out.println("  |       /|\\ ");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 1) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |       \\|/ ");
            System.out.println("  |        |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");
        }
        if (lives == 0) {
            System.out.println("");
            System.out.println("  _________");
            System.out.println("  |        |");
            System.out.println("  |       (O)");
            System.out.println("  |       \\|/ ");
            System.out.println("  |        |");
            System.out.println("  |       / \\");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|__________");
            System.out.println("");

        }
    }
}
