import java.util.*;
public class ConvergingLensImageAndObjectRelationships{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the distance of the object: ");
		int distanceo = console.nextInt();
		System.out.println("Enter the distance of the image: ");
		double distancei= console.nextDouble();
		System.out.println("Enter the height of the image: ");
		double heighti = console.nextDouble();
		System.out.println("Enter the height of the object: ");
		double heighto = console.nextDouble();
		double theoretical1overf = (1/distancei)+(1/distanceo);
		System.out.println("1/do+1/di (column 4)= "+theoretical1overf);
		double heightiovero = heighti/heighto;
		System.out.println("hi/ho (column 6) = "+heightiovero);
		double negativedioverdo = -(distancei/distanceo);
		System.out.println("-di/do (column 7) = "+negativedioverdo);
	}
}