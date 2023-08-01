public class Dog {
    // static variable
    private static String name;

    // instance variable
    private String realName;

    public Dog(String name){
        this.realName = name;
        Dog.name = name;
    }


    public void printName(){
        System.out.println("name= " + name);
        System.out.println("realName= " + this.realName);
    }
}
