package mentor_lesson5;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name  = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id  = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
