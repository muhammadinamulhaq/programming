import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scn = new Scanner(System.in);

        int sum = 0, count = 0;
        long average = 0;
        boolean isAnInt;

        while(true){
            isAnInt = scn.hasNextInt();
            if(isAnInt){
                int number = scn.nextInt();
                sum += number;
                count++;
                average = Math.round((double)sum/(double)count);
            }else{
                break;
            }
            scn.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
