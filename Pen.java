import java.util.Scanner;
public class Pen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of pens");
		int pens=sc.nextInt();
		System.out.println("The Pen Per Student is " + pens/3+ " and the remaining pen not distributed is "+ pens%3);
		
	}
}
