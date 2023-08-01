import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        Integer num = new Integer(15);
        System.out.println(num.toString());
        System.out.println(num);

        System.out.println("Abhishek");
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));

        System.out.println(rev(-123));
    }

    static int rev(int x){
        long rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;

        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return (int)rev;
    }
}