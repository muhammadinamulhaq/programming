package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        // for loop equivalent to while loop
        for(count = 1; count < 5; count++){
            System.out.println("Count value is " + count);
        }

        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while (count != 5);

        count = 0;
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number " + number);
            count++;
            if(count == 5){
                break;
            }
        }
        System.out.println("Count of even numbers " + count);

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
