package afs.training.oo;

public class Truck {

    private String name;

    private int speed;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void SpeedUp() {
        speed += 2;
        System.out.printf("%s: speed up to %d km/h\n",name, speed);
    }
}
