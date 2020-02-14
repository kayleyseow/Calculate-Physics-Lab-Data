//calculates the value of g given length and period
import java.util.*;
import java.lang.Math.*;
public class thePendulum{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("enter value of L");
		double L = console.nextDouble();
		System.out.println("enter value of t");
		double t = console.nextDouble();
		double period = t/20;
		System.out.println("period equals: " +period);
		double g = ((4*Math.PI*Math.PI*L)/(period*period));
		System.out.println("g equals: " +g);
		double absoluteerror = ((g-9.81)/9.81)*100;
		System.out.println("absoluteerror equals: " +absoluteerror);
		double relativeerror = absoluteerror/9.81*100;
		System.out.println("relativeerror equals: " +relativeerror);
	}
}
