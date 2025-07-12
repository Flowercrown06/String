package mentor_lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonService personService = new PersonService();
      while(true){
          System.out.println("What do u want to do?");
          System.out.println("1.registration\n2.show all\n3.exit");

          int choice=sc.nextInt();
          switch(choice) {
              case 1:   personService.register();
                  break;
              case 2:   personService.showAll();
                  break;
              case 3:    personService.exit();
                  break;
          }
      }
    }

}
