package overriding;

public class Employee {
    public void calculateSalary(){
        System.out.println("Calculating salary for a general employee");
    }

    public String getRole(){
        return "Employee";
    }
}
