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

class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException("Wrong sides");
        }
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double side) {
        if (side > 0) {
            a = side;
        } else {
            throw new IllegalArgumentException("SetA-wrong side");
        }
    }

    public void setB(double side) {
        if (side > 0) {
            b = side;
        } else {
            throw new IllegalArgumentException("SetB-wrong side");
        }
    }

    public void setC(double side) {
        if (side > 0) {
            c = side;
        } else {
            throw new IllegalArgumentException("SetC-wrong side");
        }
    }

    public String toString() {
        return String.format("Triangle a: %.2f b: %.2f c: %.2f perimeter: %.2f area: %.2f\n",  
                            a,b,c, perimeter(), area() );
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

        Triangle t1 = new Triangle(3, 4, 6);
        System.out.println(t1);
    }
}
