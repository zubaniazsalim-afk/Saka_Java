public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("Alex", "KZ12345");
        Driver d2 = new Driver("Dana", "KZ67890");

        Vehicle car = new Car("Toyota", 2022, d1, 4, "Petrol");
        Vehicle bike = new Motorcycle("Yamaha", 2020, d2, false);
        Vehicle truck = new Truck("Volvo", 2019, d1, 15.5, 6);

        Vehicle[] vehicles = { car, bike, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriver();
            v.stopEngine();
            System.out.println("--------------------");
        }
    }
}
