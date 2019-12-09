package ThirdHomework;

import java.util.Random;

public class Car {
    private boolean engineWork;
    private int workEngine;
    private int speed;
    private int distance;

    public void startEngine() {
        this.engineWork = new Random().nextBoolean();
        if (engineWork) {
            System.out.println("Good job, your engine get started");
            while (workEngine < 10) {
                System.out.println("Engine work " + workEngine + " second");
                workEngine++;
            }
        } else {
            System.out.println("Don`t worry, next time you can ");
        }
    }

    public void startCar() {
        if (engineWork) {
            while (distance < 20) {
                distance++;
                speed = 100;
                System.out.println("We drove by " + distance + " at speed " + speed + " km/h");
            }
        }
    }

    public void stopCar() {
        speed = 0;
        System.out.println("Your car stopped ");
    }

    public void stopEngine() {
        this.engineWork = false;
        System.out.println("Your engine stopped work ");

    }
}