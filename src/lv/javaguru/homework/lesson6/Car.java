package lv.javaguru.homework.lesson6;

//Uzmanīgi izlasi uzdevumu, šis nav pabeigts

//izmanto "ctrl + lat + l"
public class Car {

    //trūkst stāvokļu

    public static void main(String[] args) {
        accelerate();
        System.out.println();

        slowDown();
        System.out.println();
    }


    //šai metodei ir jāpalielina ātrums tikai par 1 vienību
    //šai metodei nav jābut static
   public static  void accelerate() {
       int maxSpeed = 100;
       for (int currentSpeed = 0; currentSpeed < maxSpeed; currentSpeed++) {

           System.out.println("Speed up by: " + currentSpeed);
       }
   }
    //šai metodei ir jāsamazina ātrums tikai par 1 vienību
    //šai metodei nav jābut static
        public static void slowDown() {
            for (int currentSpeed = 100; currentSpeed > 0; currentSpeed--) {
                System.out.println(" Speed down by: " + currentSpeed);
            }
        }

    //šīs metodes darbība nav nodemonstrēta
    //šai metodei ir jāpasak - vai auto brauv vai nē -> "currentSpeed > 0
        public boolean isDriving(int currentSpeed) {
            for (int i = 0; i < currentSpeed;  i++){
                if (currentSpeed % i == 0) {  //šeit pietiek pārbaudīt
                    return false;
                }
            }
            return true;
        }

        //šīs metodes darbība nav nodemonstrēta
        public boolean canAccelerate (int currentSpeed) {
            for( int i = 0; i > 50; i++) {
                if ( currentSpeed % i == 100) {
                    return false;
                }
            }
            return true;
        }

        }











