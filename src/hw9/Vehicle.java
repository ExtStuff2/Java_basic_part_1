package hw9;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void start() {
        Engine engine = new Engine();
        engine.run(20);
    }

    public int getSpeed() {
        return speed;
    }

    class Engine implements Runnable {
        @Override
        public void run(int acceleration) {
            speed += acceleration;
        }
    }
}
