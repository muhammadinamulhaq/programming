public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int m = (int)(a * 1000);
        int n = (int)(b * 1000);
        if(m == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
