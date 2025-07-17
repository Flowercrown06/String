package polymorphism;

import java.math.BigDecimal;

public class Student extends Person {
    private BigDecimal scholarship;

    public Student( String  name, String surname,int age, BigDecimal scholarship) {
        super(name,  surname, age);
        this.scholarship = scholarship;
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm student " + name + " " + surname + ", age " + age + ", scholarship:"+ scholarship);
    }

    @Override
    public String getRole(){
        return "student";
    }

    public void study() {
        System.out.println(name + " is studying Java.");
    }
}
