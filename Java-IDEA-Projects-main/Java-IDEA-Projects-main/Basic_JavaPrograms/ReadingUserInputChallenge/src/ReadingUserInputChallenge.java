import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void sumScannerNumbers() {
        Scanner scn = new Scanner(System.in);

        int sum = 0, number;

        for(int i = 1; i <= 10;)
        {
            System.out.print("Enter number #" + i + ":");
            boolean hasNextInt = scn.hasNextInt();
            if(hasNextInt){
                i++;
                number = scn.nextInt();
                sum += number;
                if(i == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
            scn.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum = " + sum);

        scn.close();
    }
}
