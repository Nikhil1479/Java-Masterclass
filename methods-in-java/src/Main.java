public class Main {
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 8000;
//        int levelCompleted = 8;
//        int bonus = 200;
//
//        System.out.println("Your Final Score is: "+ calculateScore(gameOver,score,levelCompleted,bonus));
//
//        System.out.println("Your Second Score is: "+ calculateScore(true,10000,8,200));

//      CHALLENGE
//         Create a method called displayHighScorePosition
//         it should a players name as a parameter, and a 2nd parameter as a position in the high score table
//         You should display the players name along with a message like " managed to get into position " and the
//         position they got and a further message " on the high score table".
//
//         Create a 2nd method called calculateHighScorePosition
//         it should be sent one argument only, the player score
//         it should return an in
//         the return data should be
//         1 if the score is >=1000
//         2 if the score is >=500 and < 1000
//         3 if the score is >=100 and < 500
//         4 in all other cases
//         call both methods and display the results of the following
//         a score of 1500, 900, 400 and 50

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScore("Nikhil", highScorePosition);

        highScorePosition = calculateHighScorePosition(600);
        displayHighScore("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Emma", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScore("Stone", highScorePosition);
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
//    {
//        if(gameOver == true)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
////            System.out.println("Your Final Score is: "+ finalScore);
//            return finalScore;
//        }
//        return -1;
//    }

    public static void displayHighScore(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else
            return 4;
    }

}