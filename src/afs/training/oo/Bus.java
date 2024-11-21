package afs.training.oo;

public class Bus extends Vehicle {

    public static final int Acceleration = 5;

    private Engine engine;

    public Bus(String name, int speed, Engine engine) {
        super(name,speed);
        this.engine = engine;
    }

    @Override
    public void SpeedUp() {
        speed += engine.getAcceleration();
        System.out.printf("%s: speed up to %d km/h\n",name, speed);
    }
}
