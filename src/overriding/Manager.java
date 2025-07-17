package overriding;

public class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for a manager");
    }

    @Override
    public String getRole(){
        return "Manager";
    }
}
