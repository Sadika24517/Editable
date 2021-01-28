public class Drone {

    //Properties of Drone

    int weight;
    String propellers;
    int DiagonalDistance;
    int InternalStorage;
    String Compass;
    int BatteryCapacity;
    String IMU;

    //Factory of Drone

    public Drone(int weight, String propellers, int DiagonalDistance,
                 int InternalStorage, String Compass, int BatteryCapacity, String IMU){
        this.weight = weight;
        this.propellers = propellers;
        this.DiagonalDistance = DiagonalDistance;
        this.InternalStorage = InternalStorage;
        this.Compass = Compass;
        this.BatteryCapacity = BatteryCapacity;
        this.IMU = IMU;

        System.out.println("We are inside the Drone factory");

    }

    //Our Drone factory is ready
    //Now lets create the Drone object

    public static void main(String[] args) {

        System.out.println("I am building my Drone Application and this is the first thing going to be printed");

// Constructor --> It constructs the object Drone (We are going to invoke Drone
//                  constructor by saying the "new" word for making the object)

        Drone MavicAir2 = new Drone(570, "QuickRelease,LowNoise,Folding", 302, 8, "Single Compass", 3500, "SingleIMU");
        Drone MavicMini = new Drone(249, "QuickRelease,LowNoise", 213, 5, "SingleCompass", 2500, "SingleIMU");

        MavicAir2.DroneAction("MavicAir2");
        MavicMini.DroneAction("MavicMini");

    }
//       As we call Drone constructor here the full bunch of code from line 1-24 will be considered
//       and line 24 will be executed once we run.





// We need to write a method to run our Drone.
// So our method name is --> "DroneAction"


public void DroneAction(String DroneName){
        //If we don't give A light name It won't work.It says - which drone we want to run??
        // So we have to set the drone name at the main package.

   System.out.println("Action Completed Successfully " + DroneName);
}

}



