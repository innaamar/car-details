abstract class Car {
    private String regNumber;
    private int manufactureYear;
    private String brand;

    public Car(String regNumber, int manufactureYear, String brand) {
        this.regNumber = regNumber;
        this.manufactureYear = manufactureYear;
        this.brand = brand;
    }

    public abstract String getType();

    public String toString() {
        return String.format("%s %d %s %s", getType(), manufactureYear, brand, regNumber);
    }
}

class Truck extends Car {
    private int capacity;

    public Truck(String regNumber, int manufactureYear, String brand, int capacity) {
        super(regNumber, manufactureYear, brand);
        this.capacity = capacity;
    }

    public String getType() {
        return "Truck";
    }
}

class Bus extends Car {
    private int nrOfPeople;

    public Bus(String regNumber, int manufactureYear, String brand, int nrOfPeople) {
        super(regNumber, manufactureYear, brand);
        this.nrOfPeople = nrOfPeople;
    }

    public String getType() {
        return "Bus";
    }

}

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("AB-123-CD", 2010, "Volvo", 10000),
                new Bus("BC-234-DE", 2015, "Mercedes", 50),
                new Truck("CD-345-EF", 2015, "MAN", 12000),
                new Bus("DE-456-FG", 2012, "Neoplan", 60),
                new Bus("EF-567-GH", 2018, "Scania", 70)
        };

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
