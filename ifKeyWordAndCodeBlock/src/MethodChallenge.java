public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sel", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Ahl", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Onr", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Kwa", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("Aku", highScorePosition);

    }


    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " + playersPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500) {
            return 2;
        } else if (playersScore >= 100) {
            return 3;
        }
        return 4;
    }
}
