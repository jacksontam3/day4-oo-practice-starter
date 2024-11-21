package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        Driver driver = new Driver(new Bus("Cool Bus with gasoline engine", 25, gasolineEngine));
        driver.getVehicle().SpeedUp();

        ElectricEngine electricEngine = new ElectricEngine();
        driver.setVehicle(new Bus("Cool Bus with electric engine", 25, electricEngine));
        driver.getVehicle().SpeedUp();

        Truck truck = new Truck("Big Truck", 20);
        driver.setVehicle(truck);
        driver.getVehicle().SpeedUp();


    }
}