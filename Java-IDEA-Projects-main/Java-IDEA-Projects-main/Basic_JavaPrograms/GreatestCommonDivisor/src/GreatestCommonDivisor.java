public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if(a < 10 || b < 10){
            return  -1;
        }

        int gcd = 1;
        int temp_gcd = 1;
        if(a > b){
            while(b >= temp_gcd){
                if((a % temp_gcd == 0) && (b % temp_gcd == 0)){
                    gcd = temp_gcd;
                }
                temp_gcd++;
            }
        }else if(a < b){
            while(a >= temp_gcd){
                if((a % temp_gcd == 0) && (b % temp_gcd == 0)){
                    gcd = temp_gcd;
                }
                temp_gcd++;
            }
        }

        return gcd;
    }
}
