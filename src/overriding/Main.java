package overriding;

public class Main {
    public static void main(String[] args) {
        Employee employee_1= new Employee();
        Employee employee_2= new Manager();
        Employee employee_3= new Developer();

        employee_1.calculateSalary();
        employee_2.calculateSalary();
        employee_3.calculateSalary();

        System.out.println(employee_1.getRole());
        System.out.println(employee_2.getRole());
        System.out.println(employee_3.getRole());
    }
}
