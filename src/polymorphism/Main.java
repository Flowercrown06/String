package polymorphism;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Aylin", "Agazade",17);
        Student student = new Student("Aliye","Abbasova",32,new BigDecimal("100"));
        Person student_2 = new Student("Aygun","Quliyeva",23,new BigDecimal("200"));

        person.introduce();
        person.getRole();

        student.introduce();
        student.getRole();
        student.study();

        student_2.introduce();
        student_2.getRole();
      // student_2.study();

        if (student_2 instanceof Student) {
            ((Student)student_2).study();
        }

    }
}
