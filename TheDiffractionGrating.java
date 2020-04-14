import java.util.*;
public class TheDiffractionGrating{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Color = VIOLET");
        System.out.println("Enter Value of x1(in cm): ");
        double vx1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double vx2 = console.nextDouble();
        System.out.println("Color = BLUE");
        System.out.println("Enter Value of x1(in cm): ");
        double bx1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double bx2 = console.nextDouble();
        System.out.println("Color = GREEN");
        System.out.println("Enter Value of x1(in cm): ");
        double gx1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double gx2 = console.nextDouble();
        System.out.println("Color = YELLOW");
        System.out.println("Enter Value of x1(in cm): ");
        double yx1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double yx2 = console.nextDouble();
        System.out.println("Color = ORANGE");
        System.out.println("Enter Value of x1(in cm): ");
        double ox1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double ox2 = console.nextDouble();
        System.out.println("Color = RED");
        System.out.println("Enter Value of x1(in cm): ");
        double rx1 = console.nextDouble();
        System.out.println("Enter Value of x2(in cm): ");
        double rx2 = console.nextDouble();
        System.out.println("\nViolet Wavelength 1= "+wavelength(vx1)+" in cm, "+innm(wavelength(vx1))+" in nm");
        System.out.println("Violet Wavelength 2= "+wavelength(vx2)+" in cm, "+innm(wavelength(vx2))+" in nm");
        System.out.println("\nBlue Wavelength 1= "+wavelength(bx1)+" in cm, "+innm(wavelength(bx1))+" in nm");
        System.out.println("Blue Wavelength 2= "+wavelength(bx2)+" in cm, "+innm(wavelength(bx2))+" in nm");
        System.out.println("\nGreen Wavelength 1= "+wavelength(gx1)+" in cm, "+innm(wavelength(gx1))+" in nm");
        System.out.println("Green Wavelength 2= "+wavelength(gx2)+" in cm, "+innm(wavelength(gx2))+" in nm");
        System.out.println("\nYellow Wavelength 1= "+wavelength(yx1)+" in cm, "+innm(wavelength(yx1))+" in nm");
        System.out.println("Yellow Wavelength 2= "+wavelength(yx2)+" in cm, "+innm(wavelength(yx2))+" in nm");
        System.out.println("\nOrange Wavelength 1= "+wavelength(ox1)+" in cm, "+innm(wavelength(ox1))+" in nm");
        System.out.println("Orange Wavelength 2= "+wavelength(ox2)+" in cm, "+innm(wavelength(ox2))+" in nm");
        System.out.println("\nRed Wavelength 1= "+wavelength(rx1)+" in cm, "+innm(wavelength(rx1))+" in nm");
        System.out.println("Red Wavelength 2= "+wavelength(rx2)+" in cm, "+innm(wavelength(rx2))+" in nm");
        double pe1 = percenterror(innm(wavelength(vx1)),380);
        double pe2 = percenterror(innm(wavelength(vx2)),450);
        double pe3 = percenterror(innm(wavelength(bx2)),500);
        double pe4 = percenterror(innm(wavelength(gx2)),570);
        double pe5 = percenterror(innm(wavelength(yx2)),590);
        double pe6 = percenterror(innm(wavelength(ox2)),610);
        double pe7 = percenterror(innm(wavelength(rx2)),750);
        double totalpercenterror = (pe1+pe2+pe3+pe4+pe5+pe6+pe7)/7;
        System.out.print("\nTotal Percent Error= "+totalpercenterror);
    }
    public static double wavelength(double x){
        return ((0.000189538)*(double)(Math.sin(Math.atan((double)(x/31.5)))));
    }
    public static double innm(double mm){
        return mm*10000000;
    }
    public static double percenterror(double experimental, double theoretical){
        return ((Math.abs(theoretical-experimental))/theoretical)*100;
    }
}