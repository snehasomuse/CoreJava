
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


public class Multiplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		int a=Integer.parseInt(ob.readLine());
		System.out.println("Enter first number: ");
		int b=Integer.parseInt(ob.readLine());  //ob.readLine generate NumberFormatException and IOException
		
		System.out.println(a*b);
		System.err.println("This is error msg...");
		
	}
}

/*Variable initialization
1. Static init(compile time): eg. int a=10;
2.Dynamic init(Runtime): 
	a)BufferReader class(java.io pkg)
	b)Scanner class(java.util pkg)


Stream: flow of data
1.Input Stream: System.in
2.Output Stream: System.out
3.Error Stream: System.error*/
