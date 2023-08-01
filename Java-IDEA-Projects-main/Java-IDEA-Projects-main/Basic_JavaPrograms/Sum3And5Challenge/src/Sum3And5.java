public class Sum3And5 {
    public static void PrintSum3And5() {
        int sum = 0, count = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                System.out.println("Number " + i + " is divisible by both 3 and 5.");
                sum += i;
                if(count == 5){
                    System.out.println("Exiting the loop...");
                    break;
                }
            }
        }

        System.out.println("Sum of the numbers is " + sum);
    }
}
