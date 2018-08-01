
package hello.world;
import java.awt.*;

public class Car {
    //data types
    // int -> integer 1,2,3
    // string license Plate
    // color
    // true of false check tail working
    int averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;
    
    public Car(int inputAverageMPG, String inputLicensePlate, Color inputPaintColor,boolean inputAreTailingWorking)
    {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }
    
    public void changePaitColor(Color newPaintColor)
    {
       this.paintColor = newPaintColor;
    }
    
    public double speedingUp(double currentSpeed)
    {
        currentSpeed += 100;
        return currentSpeed;
    }
          
}
