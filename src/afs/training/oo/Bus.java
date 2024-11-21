package afs.training.oo;

public class Bus {

    private String name;

    private int speed;

    public Bus(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void SpeedUp() {
        speed += 5;
        System.out.printf("%s: speed up to %d km/h\n",name, speed);
    }
}
