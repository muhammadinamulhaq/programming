public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if(n1 <  10 || n1 > 99 || n2 < 10 || n2 > 99){
            return false;
        }

        boolean res = false;

        int right1 = n1 % 10;
        int left1 = n1 / 10;
        int right2 = n2 % 10;
        int left2 = n2 / 10;

        if(right1 == right2 || right1 == left2 || left1 == right2 || left1 == left2){
            res = true;
        }

        return res;
    }
}
