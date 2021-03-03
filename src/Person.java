import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Person {
    public static Scanner in = new Scanner(System.in);
    private String name;
    private String phone;
    private String email;
    private static List<Person> persons = new ArrayList<>();

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        addPerson(this);
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    public static void addPerson(Person person) {
        persons.add(person);
    }

    public static void removePerson(Person person) {
        persons.remove(person);
    }

    public static void showAll() {
        System.out.println("Экстенся класы Персона: ");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public String toString() {
        return "\n\nName : " + this.getName() + "\nPhone number: "
                + this.getName() + "\nEmail: " + this.getEmail();
    }

    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {
            case "1":
                for (Person person : persons) {
                    if (person.name.equals(searchString)) {
                        System.out.println(person.name + ' ' + person.phone + ' ' + person.email);
                        break; }
                }break;
                 //Фильт по Имени
            case "2":
                for (Person person : persons) {
                    if (person.phone.equals(searchString)) {
                        System.out.println(person.name + ' ' + person.phone + ' ' + person.email);
                        break; }
                }break;
                 // Фильтр по Номеру
            case "3":
                for (Person person : persons) {
                    if (person.email.equals(searchString)) {
                        System.out.println(person.name + ' ' + person.phone + ' ' + person.email);
                        break; }
                }break;
           // default: System.out.println("Person no found");
                 // Фильтр по мылу

        }
    }
}




