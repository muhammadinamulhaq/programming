import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();
        int rev = 0;
        int temp = n;
        while(temp > 0){
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }

        System.out.println("Reverse of " + n + " is " + rev);
    }
}