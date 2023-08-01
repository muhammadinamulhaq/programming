import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Abhishek Chandra";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
//        System.out.println(6%1);
        System.out.println("   Abhi    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
