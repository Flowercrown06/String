package interfaceExample;

public class Car implements Drivable{

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car is accelerating: " + speed);
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}
