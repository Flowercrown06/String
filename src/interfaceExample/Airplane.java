package interfaceExample;

public class Airplane implements Flyable, Drivable {
    @Override
    public void start() {
        System.out.println("Airplane is starting");
    }

    @Override
    public void stop() {
        System.out.println("Airplane is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Airplane is accelerating: "+ speed);
    }

    @Override
    public void brake() {
        System.out.println("Airplane is braking");
    }

    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing");
    }
}
