package DefiningClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String name = scanner.next();
            int age = scanner.nextInt();

            Person p = new Person();
            p.name=name;
            p.age=age;

            if(p.age > 30){
                people.add(p);
            }

        }

        people.sort(Comparator.comparing(f -> f.name));


        for (Person person : people) {
            System.out.println(person.name + " - " + person.age);
        }
    }

}
