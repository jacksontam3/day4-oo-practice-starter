package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Cool Bus", 25);
        bus.SpeedUp();
        Truck truck =  new Truck("Big Truck", 20);
        truck.SpeedUp();
    }
}