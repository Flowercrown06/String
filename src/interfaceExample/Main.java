package interfaceExample;

public class Main {
    public static void main(String[] args) {
        Drivable car = new Car();
        Drivable airplane = new Airplane();
        Flyable airplane_2 = new Airplane();
        Airplane airplane_3= new Airplane();

        System.out.println("----Car----");
        car.start();
        car.stop();
        car.accelerate(100);
        car.brake();

        System.out.println("----Airplane as vehicle----");
        airplane.start();
        airplane.stop();
        airplane.accelerate(200);
        airplane.brake();

        System.out.println("----Airplane as airplane----");
        airplane_2.takeOff();
        airplane_2.fly();
        airplane_2.land();

        System.out.println("----Airplane as both----");
        airplane_3.start();
        airplane_3.stop();
        airplane_3.accelerate(300);
        airplane_3.brake();
        airplane_3.takeOff();
        airplane_3.fly();
        airplane_3.land();
    }
}
