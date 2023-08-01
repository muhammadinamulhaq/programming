package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "This is my string";
        System.out.println("myString is equal to " + myString);

        myString += ", and this is more to myString. ";
        System.out.println("myString is equal to " + myString);

        myString += "\u00A9 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "200.55";
        numberString += "99.45";

        System.out.println(numberString);

        String lastString = "10";

        int myInt = 50;

        lastString += myInt;
        System.out.println("lastString : " + lastString);

        double doubleNumber = 120.7d;

        lastString += doubleNumber;

        System.out.println("lastString : " + lastString);
    }
}
