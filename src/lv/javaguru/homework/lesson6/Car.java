package lv.javaguru.homework.lesson6;

public class Car {
    public static void main(String[] args) {
        accelerate();
        System.out.println();

        slowDown();
        System.out.println();
    }


   public static  void accelerate() {
       int maxSpeed = 100;
       for (int currentSpeed = 0; currentSpeed < maxSpeed; currentSpeed++) {

           System.out.println("Speed up by: " + currentSpeed);
       }
   }
        public static void slowDown() {
            for (int currentSpeed = 100; currentSpeed > 0; currentSpeed--) {
                System.out.println(" Speed down by: " + currentSpeed);
            }
        }

        public boolean isDriving(int currentSpeed) {
            for (int i = 0; i < currentSpeed;  i++){
                if (currentSpeed % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean canAccelerate (int currentSpeed) {
            for( int i = 0; i > 50; i++) {
                if ( currentSpeed % i == 100) {
                    return false;
                }
            }
            return true;
        }

        }











