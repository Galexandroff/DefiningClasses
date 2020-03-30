package DefiningClasses3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while(n--> 0){
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);


            cars.put(model, new Car(model,fuel,consumption));
        }

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String car = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            if(!cars.get(car).drive(distance)){
                System.out.println("Insufficient fuel for the drive");
            }


            input=scanner.nextLine();
        }

        for (Car value : cars.values()) {
            System.out.println(value);
        }
    }
}
