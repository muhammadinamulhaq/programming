public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        car.startEngine();
        car.accelerate(4);
        car.brake();

        Maruti maruti = new Maruti("Swift", 6, 5);
        maruti.startEngine();
        maruti.accelerate(4);
        maruti.brake();

        Honda honda = new Honda("Honda City", 6, 5);
        honda.startEngine();
        honda.accelerate(5);
        honda.brake();

        Ford ford = new Ford("Endeavour", 6, 7);
        ford.startEngine();
        ford.accelerate(3);
        ford.brake();
    }
}


class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine(){
        System.out.println("Car-> Engine Started");
    }

    public void accelerate(int acceleration){
        System.out.println("Car-> Accelerating at " + acceleration);
    }

    public void brake(){
        System.out.println("Car-> Applied breaks");
    }
}


class Maruti extends Car{
    private int seats;

    public Maruti(String name, int cylinder, int seats) {
        super(name, cylinder);
        this.seats = seats;
    }

    @Override
    public void startEngine(){
        System.out.println("Maruti-> Engine Started");
    }

    @Override
    public void accelerate(int acceleration){
        System.out.println("Maruti-> Accelerating at " + acceleration);
    }

    @Override
    public void brake(){
        System.out.println("Maruti-> Applied breaks");
    }
}

class Honda extends Car{
    private int seats;

    public Honda(String name, int cylinder, int seats) {
        super(name, cylinder);
        this.seats = seats;
    }

    @Override
    public void startEngine(){
        System.out.println("Honda-> Engine Started");
    }

    @Override
    public void accelerate(int acceleration){
        System.out.println("Honda-> Accelerating at " + acceleration);
    }

    @Override
    public void brake(){
        System.out.println("Honda-> Applied breaks");
    }
}

class Ford extends Car{
    private int seats;

    public Ford(String name, int cylinder, int seats) {
        super(name, cylinder);
        this.seats = seats;
    }

    @Override
    public void startEngine(){
        System.out.println("Ford-> Engine Started");
    }

    @Override
    public void accelerate(int acceleration){
        System.out.println("Ford-> Accelerating at " + acceleration);
    }

    @Override
    public void brake(){
        System.out.println("Ford-> Applied breaks");
    }
}