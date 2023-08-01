public class Main {
    public static void main(String[] args) {
        Calculator.printSum(5, 10); // prints "15"
        printHello(); // prints "Hello"

        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        rex.printName(); // prints "fluffy" as name and "rex" as realName
        fluffy.printName(); // prints "fluffy" as name and "fluffy" as realName

    }

    public static void printHello(){
        System.out.println("Hello");
    }
}
