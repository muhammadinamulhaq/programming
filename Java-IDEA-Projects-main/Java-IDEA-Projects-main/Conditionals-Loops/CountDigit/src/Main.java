import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Long n = in.nextLong();
        int x = in.nextInt();
        int count = 0;
        Long temp = n;
        for (int i = 10; temp != 0;) {
            if((temp % i) == x){
                count++;
            }
            temp /= i;
        }
        System.out.println("Count of " + x + " in " + n + " is " + count);
    }
}
