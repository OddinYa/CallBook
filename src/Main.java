import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Person person1 = new Person("Julia", "9", "yy@f.ru");
        Person person2 = new Person("Vova", "8", "hj@f.ru");
        Person person3 = new Person("Glina", "6", "gd@f.ru");
        Person person4 = new Person("Govno", "5", "13@f.ru");
        Person person5 = new Person("Pidr", "2", "Jfg@f.ru");
        Person person6 = new Person("Avas", "1", "J2@f.ru");
        Person person7 = new Person("Dimitriys", "4", "J3@f.ru");

        //Person.showAll();
        //Person.showMainMenu();
        boolean flag = false;
        while (!flag) {
            System.out.print("If you want to search by name, please enter 1, by number 2, by email 3: ");
            String searchType = in.nextLine();
            if (searchType.length() > 1) {
                System.out.println("Error. You enter not 1,2,3");
            } else {
                String enterMan = searchType.substring(0, 1);
                if (enterMan.equals("1") || enterMan.equals("2") || enterMan.equals("3")) {
                    flag = true;
                    System.out.print("Please enter a search term: ");
                    String searchString = in.nextLine();
                    Person.findPerson(searchType, searchString);
                } else {
                    System.out.println("Error. You enter not 1,2,3");
                }


            }
        }
    }
}




