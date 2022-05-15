public class IfElseIf {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 8;
        int bonus = 200;

//        if(score < 5000 && score > 1000)
//        {
//            System.out.println("YOur Score is less than 5000 and Greater than 1000");
//        }
//        else if (score < 1000)
//        {
//            System.out.println("Your score was less than 1000");
//        }
//        else
//        {
//            System.out.println("Your Score was greater than 5000");
//        }

        if(gameOver == true)  // or if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);  //the variable final score will be deleted after the code block ends
//                                                                as this is only valid for this scope.
            System.out.println("Your Final Score is: "+ finalScore);
        }

//      CHALLENGE

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if(newGameOver)
        {
            int secondScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your Second Score is: "+secondScore);
        }
    }
}
