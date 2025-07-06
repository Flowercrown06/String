package mentor_lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = null;

        while (true) {
            System.out.println("What do u want to do?");
            System.out.println("1.registration\n2.show all\n3.exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How many people do you want to register?");
                    int numberOfPeople = sc.nextInt();
                    sc.nextLine();
                    people = new Person[numberOfPeople];

                    for (int i = 0; i < numberOfPeople; i++) {
                        System.out.println("Enter name for person " + (i + 1) + ":");
                        String name = sc.nextLine();
                        System.out.println("Enter age for person " + (i + 1) + ":");
                        int age = sc.nextInt();
                        sc.nextLine();
                        people[i] = new Person(name, age);
                    }
                    break;

                case 2:
                    if (people == null) {
                        System.out.println("No people registered yet.");
                    } else {
                        for (Person p : people) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
