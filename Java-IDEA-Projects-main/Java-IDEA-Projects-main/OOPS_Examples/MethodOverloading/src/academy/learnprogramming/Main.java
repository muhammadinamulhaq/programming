package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int newScore = calculateScore("Chandra", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
            calcFeetAndInchesToCentimeters(-10);

    }

//    public static int calculateScore(String name, int score) {
//        System.out.println("Player " + name + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }

    // Challenge Begins
    public static double calcFeetAndInchesToCentimeters(double feet, int inches) {
        if(feet < 0 || inches < 0 || inches > 12)
        {
            System.out.println("Invalid feet or inches.");
            return -1;
        }
        double cm = (feet * 30.48d) + (inches * 2.54d);
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cms." );
        return cm;
    }

    public static int calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0)
        {
            System.out.println("Invalid inches.");
            return -1;
        }
        int feet = inches / 12;
        inches %= 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + inches + " inches.");
        double cms = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println(cms);
        return 0;
    }
}
