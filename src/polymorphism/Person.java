package polymorphism;

import java.math.BigDecimal;

public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " " + surname + ", and I'm " + age + " years old");
    }

    public String getRole(){
        return "person";
    }
}
