package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstVar = 20.00d;
        double secondVar = 80.00d;
        boolean checkVar = ((firstVar + secondVar) * 100.00d) % 40.0d == 0;
        System.out.println(checkVar);
        if(!checkVar)
        {
            System.out.println("Got some remainder");
        }
    }
}
