public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0){
            System.out.println("Invalid Value");
        }else if(number == 0){
            System.out.println("Zero");
        }

        int newNumber = reverse(number);
        int countNumber = getDigitCount(number);
        int countRevNumber = getDigitCount(newNumber);
        while(newNumber > 0) {

            int n = newNumber % 10;

            if (n == 0) {
                System.out.println("Zero");
            } else if (n == 1) {
                System.out.println("One");
            } else if (n == 2) {
                System.out.println("Two");
            } else if (n == 3) {
                System.out.println("Three");
            } else if (n == 4) {
                System.out.println("Four");
            } else if (n == 5) {
                System.out.println("Five");
            } else if (n == 6) {
                System.out.println("Six");
            } else if (n == 7) {
                System.out.println("Seven");
            } else if (n == 8) {
                System.out.println("Eight");
            } else if (n == 9) {
                System.out.println("Nine");
            }

            newNumber /= 10;
        }

        if(countNumber != countRevNumber){
            int zeroes = countNumber - countRevNumber;
            for(int i = 0; i < zeroes; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number < 0){
            return -1;
        }else if(number == 0){
            return 1;
        }
        int count = 0;
        while(number != 0){
            count++;
            number /= 10;
        }
        return count;
    }
}


// Alternate Method with Recursion
//public class NumberToWords {
//    public static void numberToWords(int number) {
//        if(number == 0){
//            return;
//        }
//        numberToWords(number / 10);
//        wordsOfNumbers(number % 10);
//    }
//
//    public static void wordsOfNumbers(int n) {
//        if(n == 0){
//            System.out.println("Zero");
//        }else if(n == 1){
//            System.out.println("One");
//        }else if(n == 2){
//            System.out.println("Two");
//        }else if(n == 3){
//            System.out.println("Three");
//        }else if(n == 4){
//            System.out.println("Four");
//        }else if(n == 5){
//            System.out.println("Five");
//        }else if(n == 6){
//            System.out.println("Six");
//        }else if(n == 7){
//            System.out.println("Seven");
//        }else if(n == 8){
//            System.out.println("Eight");
//        }else if(n == 9){
//            System.out.println("Nine");
//        }
//
//    }
//}
