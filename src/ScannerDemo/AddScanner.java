package ScannerDemo;
import java.util.Scanner;

public class AddScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter third number: ");
		float c=sc.nextInt();
		
		System.out.println("Enter fourth number: ");
		float d=sc.nextInt();
		
		System.out.println("Enter your name: ");
		String name=sc.next();
		
		System.out.println("Addition of first and second: "+(a+b));
		System.out.println("Addition of third and fourth:  "+(c+d));
		System.out.println("Name: "+name);
		 sc.close();
	}

}
