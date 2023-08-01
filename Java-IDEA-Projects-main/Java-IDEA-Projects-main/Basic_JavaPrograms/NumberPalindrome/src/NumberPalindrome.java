public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0){
            number *= -1;
        }
        int temp = number;
        int reverse = 0;
        while(temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        return reverse == number;
    }
}
