package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(new Bus("Cool Bus", 30));
        driver.getVehicle().SpeedUp();

        Truck truck = new Truck("Big Truck", 20);
        driver.setVehicle(truck);
        driver.getVehicle().SpeedUp();


    }
}