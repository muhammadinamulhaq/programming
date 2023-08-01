public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        boolean isPrime = true;
        int largestPrime = 2;
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
//                if(isPrime(i)){
//                    largestPrime = i;
//                }
                for(int j = 2; j * j <= i; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }

//    public static boolean isPrime(int number) {
//        boolean check = true;
//        for(int i = 2; i * i <= number; i++){
//            if(number % i == 0){
//                check = false;
//                break;
//            }
//        }
//        return check;
//    }
}
