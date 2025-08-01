public class Solution {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(9999);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Dev", highScorePosition);

        highScorePosition = calculateHighScorePosition(-2009);
        displayHighScorePosition("Bikrant", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 0;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}