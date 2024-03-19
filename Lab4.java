
package lab4;

public class Lab4 {

    public static void main(String[] args) {
       Car myCar = new Car();
       myCar.setDistance(0);
       myCar.setSpeed(0);
       
       System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
       
       myCar.accelerate(50);
       myCar.travel(2.5);
       
       System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
       
       myCar.decelerate(15);
       myCar.travel(1.5);
       
        System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
    }
    
}
