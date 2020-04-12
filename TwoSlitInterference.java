import java.util.*;
public class TwoSlitInterference{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Number of Patterns: ");
        int patterns = console.nextInt();
        for (int i=0;i<patterns;i++ ) {
            System.out.println("Enter Name of Pattern: ");
            String name = console.next();
            System.out.println("Color = RED");
            System.out.println("Enter Value of n: ");
            int rn = console.nextInt();
            System.out.println("Enter Value of a(in mm): ");
            double ra = console.nextDouble();
            System.out.println("Enter Value of x(in mm): ");
            double rx = console.nextDouble();
            System.out.println("Enter Value of l(in mm): ");
            int rl = console.nextInt();
            System.out.println("Color = GREEN");
            System.out.println("Enter Value of n: ");
            int gn = console.nextInt();
            System.out.println("Enter Value of a(in mm): ");
            double ga = console.nextDouble();
            System.out.println("Enter Value of x(in mm): ");
            double gx = console.nextDouble();
            System.out.println("Enter Value of l(in mm): ");
            int gl = console.nextInt();
            System.out.println("Color = BLUE");
            System.out.println("Enter Value of n: ");
            int bn = console.nextInt();
            System.out.println("Enter Value of a(in mm): ");
            double ba = console.nextDouble();
            System.out.println("Enter Value of x(in mm): ");
            double bx = console.nextDouble();
            System.out.println("Enter Value of l(in mm): ");
            int bl = console.nextInt();
            System.out.println("Data for Pattern "+name);
            System.out.println("Red Wavelength = "+wavelength(rn,ra,rx,rl)+" in mm, "+innm(wavelength(rn,ra,rx,rl))+" in nm");
            System.out.println("Green Wavelength = "+wavelength(gn,ga,gx,gl)+" in mm, "+innm(wavelength(gn,ga,gx,gl))+" in nm");
            System.out.println("Blue Wavelength = "+wavelength(bn,ba,bx,bl)+" in mm, "+innm(wavelength(bn,ba,bx,bl))+" in nm");
        }
    }
    public static double wavelength(int n, double a, double x, int l){
        return ((a/n)*(Math.sin(Math.atan(x/l))));
    }
    public static double innm(double mm){
        return mm*1000000;
    }
}
