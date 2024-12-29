public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.printf("%s's engine is starting%n",this.getClass().getSimpleName());
    }

    public void accelerate() {
        System.out.printf("%s's accelerating%n",this.getClass().getSimpleName());
    }

    public void brake() {
        System.out.printf("%s's braking%n%n",this.getClass().getSimpleName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
