import java.util.Scanner;
public class Miles{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in kilometer");
		float KiloMeter=sc.nextFloat();
		System.out.println("the distance "+KiloMeter+" in miles is "+(KiloMeter*1.6));
	}
}
