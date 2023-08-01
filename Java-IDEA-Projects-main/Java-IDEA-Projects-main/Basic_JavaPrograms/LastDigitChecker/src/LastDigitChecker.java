public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {

        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }

        int lastDigit1 = a % 10;
        int lastDigit2 = b % 10;
        int lastDigit3 = c % 10;

        if(lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3){
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        return (number <= 1000 && number >= 10);
    }
}
