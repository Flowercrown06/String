package overriding;

public class Developer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for a developer");
    }

    @Override
    public String getRole(){
        return "Developer";
    }
}
