import java.util.*;
public class LensAndMagnificationEquation{
    public static double focallength, objectdistance, imagedistance;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 1 to calculate Focal Length, 2 for Object Distance and 3 for Image Distance");
        int userinput = console.nextInt();
        if (userinput==1) {
            System.out.println("Enter Object Distance: ");
            objectdistance = console.nextDouble();
            System.out.println("Enter Image Distance: ");
            imagedistance = console.nextDouble();
            focallength = 1/((1/objectdistance)+(1/imagedistance));
            System.out.println("Focal Length = "+ focallength);
        }
        if (userinput==2) {
            System.out.println("Enter Focal Length: ");
            focallength = console.nextDouble();
            System.out.println("Enter Image Distance: ");
            imagedistance = console.nextDouble();
            objectdistance = (focallength*imagedistance)/(imagedistance-focallength);
            System.out.println("Object Distance = "+ objectdistance);
        }
        if (userinput==3) {
            System.out.println("Enter Focal Length: ");
            focallength = console.nextDouble();
            System.out.println("Enter Object Distance: ");
            objectdistance = console.nextDouble();
            imagedistance = (focallength*objectdistance)/(objectdistance-focallength);
            System.out.println("Image Distance = "+ imagedistance);
        }
        double magnification = -(imagedistance/objectdistance);
        System.out.println("Magnification = "+ magnification);
        if(Math.abs(magnification)>1) {
            System.out.println("Image is magnified");
        }
        if(Math.abs(magnification)==1){
            System.out.println("Image is same size as object");
        }
        if(Math.abs(magnification)<1) {
            System.out.println("Image is diminished");
        }
    }
}