package oopsintro;

public class motorBike {

    void start() {

        System.out.println("Bike Started");
    }

    int getSpeed(){
        return this.speed;
    }

    private int speed;
    void setSpeed (int speed){
        this.speed = speed;

    }

}
