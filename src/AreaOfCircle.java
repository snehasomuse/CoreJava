import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		InputStreamReader in=new InputStreamReader(System.in); //InputStream activation
		BufferedReader ob=new BufferedReader(in); //Buffer activation
		double pi=3.14; //Variable declaration
		
		System.out.println("Enter radius: ");
		double r=Double.parseDouble(ob.readLine());
		
		double area=pi*r*r;
		double perimeter=2*pi*r;
		
		
		System.out.println("Area of the circle is: "+area);
		System.out.println("Perimeter of the circle is: "+perimeter);
	}

}
