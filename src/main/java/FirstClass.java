public class FirstClass {
    public static void main(String[] args) {
        displayHighScorePosition("Ondrej",calculateHighScorePosition(1500));
        displayHighScorePosition("Ondrej",calculateHighScorePosition(1000));
        displayHighScorePosition("Ondrej",calculateHighScorePosition(500));
        displayHighScorePosition("Ondrej",calculateHighScorePosition(100));
        displayHighScorePosition("Ondrej",calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.format("%s managed to get into position %d on the high score list%n", name, position);
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        }

        if (score >= 500) {
            return 2;
        }

        if (score >= 100) {
            return 3;
        }

        return 4;

    }
}
