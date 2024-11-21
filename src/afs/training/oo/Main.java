package afs.training.oo;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver(new Bus("Cool Bus with gasoline engine", 25, new GasolineEngine()));
        driver.drive();

        driver.setVehicle(new Bus("Cool Bus with electric engine", 25, new ElectricEngine()));
        driver.drive();

        driver.setVehicle(new Truck("Big Truck", 20));
        driver.drive();


    }
}