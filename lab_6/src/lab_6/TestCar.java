package lab6;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("KIA", "CEED", "Optima", 800000, 2010);
        Car c2 = new Car("BMW", "X3", "X2", 2800000, 2015);
        Car c3 = new Car("Audi", "A3", "A4", 5000000, 2018);
        c1.println();
        c2.println();
        c3.println();
    }
}