package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");

        boolean hasNextInt = scn.hasNextInt();

        if(hasNextInt)
        {
            int yearOfBirth = scn.nextInt();
            scn.nextLine(); // handle nextLine character (enter key)

            System.out.print("Enter your name: ");
            String name = scn.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100)
            {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }
            else
            {
                System.out.println("Invalid year of birth.");
            }
        }
        else
        {
            System.out.println("unable to parse year of birth.");
        }
        scn.close();
    }
}
