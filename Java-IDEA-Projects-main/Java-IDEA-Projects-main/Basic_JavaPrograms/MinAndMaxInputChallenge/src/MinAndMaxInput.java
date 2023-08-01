import java.util.Scanner;

public class MinAndMaxInput {
    public static void minAndMax() {
        Scanner scn = new Scanner(System.in);

        int min = 0, max = 0;
        boolean isNextInt;
        boolean first = true;

        while(true){
            System.out.println("Enter number: ");
            isNextInt = scn.hasNextInt();
            if(isNextInt){
                int number = scn.nextInt();
                if(first){
                    first = false;
                    max = min = number;
                    continue;
                }

                if(max < number){
                    max = number;
                }
                if(min > number){
                    min = number;
                }
            }else{
                break;
            }
            scn.nextLine();
        }

        System.out.println("MIN: " + min + " and MAX: " + max);

        scn.close();
    }
}
