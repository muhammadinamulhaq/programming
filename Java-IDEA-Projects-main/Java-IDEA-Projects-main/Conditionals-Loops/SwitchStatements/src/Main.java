import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String fruit = scn.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet fruit");
                break;
            case "Banana":
                System.out.println("Yellow fruit");
                break;
            case "Orange":
                System.out.println("Citrus fruit");
                break;
            case "Grapes":
                System.out.println("Small fruits");
                break;
            default:
                System.out.println("Invalid fruit name");
        }

        // enhanced switch will not work in Java 11
//        switch(fruit){
//            case "Mango"-> System.out.println("King");
//            case "Apple"-> System.out.println("Sweet");
//            case "Banana"-> System.out.println("Long");
//            default-> System.out.println("Invalid");
//        }

    }
}
