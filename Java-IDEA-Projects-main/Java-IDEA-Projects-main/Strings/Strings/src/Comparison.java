public class Comparison {
    public static void main(String[] args) {
        // in string pool
        String a = "Abhi";
        String b = "Abhi";

        System.out.println(a == b); // true

        // in heap, outside string pool
        String c = new String("Abhi");
        String d = new String("Abhi");

        System.out.println(c == d); // false
        System.out.println(c.equals(d)); // true

        System.out.println(c.charAt(1));
    }
}
