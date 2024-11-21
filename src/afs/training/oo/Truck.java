package afs.training.oo;

public class Truck extends Vehicle {

    public static final int Acceleration = 2;

    public Truck(String name, int speed) {
        super(name,speed);
    }

    @Override
    public void SpeedUp() {
        speed += Acceleration;
        System.out.printf("%s: speed up to %d km/h\n",name, speed);
    }
}
