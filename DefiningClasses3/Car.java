package DefiningClasses3;

public class Car {
    private String model;
    private double fuel;
    private double consumption;
    private int distance;


    public Car(String model, double fuel, double consumption){
        this.model=model;
        this.fuel=fuel;
        this.consumption=consumption;
        this.distance=0;
    }

    public boolean drive(int distance) {
        double fuelNeeded = distance*consumption;
        if(fuelNeeded <= this.fuel){
            this.distance += distance;
            this.fuel -= fuelNeeded;
            return  true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %d", this.model, this.fuel, this.distance);
    }
}
