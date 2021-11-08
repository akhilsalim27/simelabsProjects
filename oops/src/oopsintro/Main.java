package oopsintro;

public class Main {

    public static void main(String[] args) {

        motorBike ducati = new motorBike();
        motorBike honda = new motorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100) ;
        System.out.println(ducati.getSpeed());
        honda.setSpeed(80) ;
        System.out.println(honda.getSpeed());


    }
}
