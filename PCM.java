import java.util.Scanner;
public class PCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks in order of 1.maths,2.physics,3.chemistry");
		int maths=sc.nextInt();
		int physics=sc.nextInt();
		int chemistry=sc.nextInt();
		float percentage=(maths+physics+chemistry)/3;
		System.out.println("Sam's average mark in PCM is "+percentage);
	}
}
