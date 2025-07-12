package mentor_lesson5;

import java.util.Arrays;
import java.util.Scanner;
public class PersonService {
    Scanner sc=new Scanner(System.in);
    public void register() {
        System.out.println("How many people do you want to register?");
        int peopleCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < peopleCount; i++) {
            if(peopleCount>=PersonConfig.people.length){
                System.out.println("No more space to register new people.");
                return;
            }
            System.out.println(PersonConfig.count+1 + ".Qeydiyyat");
            PersonConfig.people[PersonConfig.count++] = createPerson();
        }
    }

    public void showAll() {
        for (Person person : PersonConfig.people) {
            if (person != null)
                System.out.println(person);
        }
    }
    public void exit() {
        System.exit(0);
    }


    private String requireText(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    private int requireInt(String message){
        System.out.println(message);
        return sc.nextInt();
    }

    private Person createPerson() {
        int id = requireInt("Enter id for person " );
        sc.nextLine();
        String name = requireText("Enter name for person " );
        String surname = requireText("Enter surname for person ");
        int age = requireInt("Enter age for person " );
        return new Person(id, name, surname, age);
    }
}
