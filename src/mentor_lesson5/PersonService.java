package mentor_lesson5;

import java.util.Arrays;
import java.util.Scanner;
public class PersonService {
    Scanner sc=new Scanner(System.in);
/*    public void register() {
        System.out.println("How many people do you want to register?");
        int peopleCount = sc.nextInt();
        for (int i = 0; i < peopleCount; i++) {
            if(PersonConfig.count + peopleCount>PersonConfig.people.length){
                System.out.println("No more space to register new people.");
                return;
            }
            System.out.println(PersonConfig.count+1 + ".Qeydiyyat");
            PersonConfig.people[PersonConfig.count++] = createPerson();
        }
    }*/
public void register() {
    System.out.println("How many people do you want to register?");
    int count = sc.nextInt();
    sc.nextLine();

    int oldCount = PersonConfig.people != null ? PersonConfig.people.length : 0;
    Person[] newArray = new Person[oldCount + count];

    for (int i = 0; i < oldCount; i++) {
        newArray[i] = PersonConfig.people[i];
    }

    for (int i = oldCount; i < newArray.length; i++) {
        System.out.println("Registration" + (i + 1) + "completed.");
        newArray[i] = createPerson();
    }

    PersonConfig.people = newArray;
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

    public void find() {
        String message= """
                1-> by id;
                2-> by name;
                3-> by surname;
                4-> by age;
                """;
        System.out.println(message);
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:   findById();
                break;
            case 2:   findByName();
                break;
            case 3:   findBySurname();
                break;
            case 4:   findByAge();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void findById() {
        int id= requireInt("Enter the ID of the person you want to search for.");
        for (Person person : PersonConfig.people) {
            if(person!=null && person.getId()== id){
                System.out.println(person);
                return;
            }
        }
        System.out.println("Not found");
    }
    public void findByName() {  //startWith
        String name = requireText("Enter the name of the person you want to search for." );
        for (Person person : PersonConfig.people) {
            if(person!=null && name.equalsIgnoreCase(person.getName())){
                System.out.println(person);
                return;
            }
        }
        System.out.println("Not found");
    }
    public void findBySurname() {
        String surname = requireText("Enter the surname of the person you want to search for." );
        for (Person person : PersonConfig.people) {
            if(person!=null && surname.equalsIgnoreCase(person.getSurname())){
                System.out.println(person);
                return;
            }
        }
        System.out.println("Not found");
    }
    public void findByAge() {
        int age= requireInt("Enter the age of the person you want to search for." );
        for (Person person : PersonConfig.people) {
            if(person!=null && person.getAge()== age){
                System.out.println(person);
                return;
            }
        }
        System.out.println("Not found");
    }


    private String requireText(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    private int requireInt(String message){
        System.out.println(message);
        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    private Person createPerson() {
        int id = requireInt("Enter id for person " );
        String name = requireText("Enter name for person " );
        String surname = requireText("Enter surname for person ");
        int age = requireInt("Enter age for person " );
        return new Person(id, name, surname, age);
    }
}
