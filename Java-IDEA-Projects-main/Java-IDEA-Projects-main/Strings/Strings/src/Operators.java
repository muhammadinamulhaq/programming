import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // ASCII value taken into consideration
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' - 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("abhi" + 1);
        // int will be converted into Integer class object and then toString is called.
        System.out.println("abhi" + new ArrayList<>());
        System.out.println("abhi" + Arrays.toString(new int[]{}));
    }
}
