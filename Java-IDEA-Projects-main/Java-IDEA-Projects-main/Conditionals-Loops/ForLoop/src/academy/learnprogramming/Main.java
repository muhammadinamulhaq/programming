package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% is " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% is " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% is " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% is " + calculateInterest(10000.0, 5.0));
        System.out.println("-----------------------");
        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("-----------------------");
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " +  i + "% is " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("-----------------------");
        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " +  i + "% is " + String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("-----------------------");
        int count = 0;
        for(int i = 0; i < 100; i++){
            if(count == 10){
                break;
            }else if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number.");
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
