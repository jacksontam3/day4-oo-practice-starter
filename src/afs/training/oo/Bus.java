package afs.training.oo;

public class Bus extends Vehicle {

    public static final int Acceleration = 5;

    public Bus(String name, int speed) {
        super(name,speed);
    }

    public void SpeedUp() {
        speed += Acceleration;
        System.out.printf("%s: speed up to %d km/h\n",name, speed);
    }
}
