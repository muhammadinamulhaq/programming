package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);


        displayHighScorePosition("Abhishek", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(900));
        displayHighScorePosition("Joe", calculateHighScorePosition(400));
        displayHighScorePosition("Natasha", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
//        int finalScore = 0;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

//        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public  static int calculateHighScorePosition(int score)
    {

        int position = 4;
        if(score >= 1000)
        {
            position = 1;
//            return 1;
        }
        else if(score >= 500)
        {
            position = 2;
//            return 2;
        }
        else if(score >= 100)
        {
            position = 3;
//            return 3;
        }

        return position;

    }
}
