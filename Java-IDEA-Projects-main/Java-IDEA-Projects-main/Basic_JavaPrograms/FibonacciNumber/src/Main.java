import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(n + "th fibonacci is " + a);
    }
}
