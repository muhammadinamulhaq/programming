package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String intAsString = "2022";
        String doubleAsString = "2022.2000";

        System.out.println("intAsString = " + intAsString);
        System.out.println("doubleAsString = " + doubleAsString);

        int numberInt = Integer.parseInt(intAsString);
        double numberDouble = Double.parseDouble(doubleAsString);

        System.out.println("numberInt = " + numberInt);
        System.out.println("numberDouble = " + numberDouble);

        intAsString += 1;
        doubleAsString += 1;
        numberInt += 1;
        numberDouble += 1;

        System.out.println("intAsString = " + intAsString);
        System.out.println("doubleAsString = " + doubleAsString);
        System.out.println("numberInt = " + numberInt);
        System.out.println("numberDouble = " + numberDouble);
    }
}
