import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConvert {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the Temperature in fahrenheit: ");
		double temp=Double.parseDouble(ob.readLine());
		
		System.out.println("Temperature in celcius is: "+(temp-32)*5/9);

	}

}
