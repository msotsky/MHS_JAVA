/*
*Max
*Mr.Pope
*April 19 2018
*j9 Q2
*This program converts celcius to fahrenheit and fahrenheit to celcius
*/
import java.io.*;
class Temperature
{

        private double temp; 
        
        
        public void setTemp(double number){
	temp = number;
	}



	public double convertF()	//method for celcius to fehrenheit
	{
	     return ((9.0 / 5.0) * temp + 32);
	}
	public double convertC()	//method for fehrenheit to celcius
	{
	     return ((5.0 / 9.0) * (temp - 32));
	}

}
public class TemperatureTester2 //main
{	//gathering information from the user
	public static void main (String[] args)throws IOException
	{
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader (inStream);
	
	String inData;
	double usertemp;
	//have the user enter a temperature number
	System.out.println("Enter a temperature in celcius or fahrenheit");
	inData = stdin.readLine();
	usertemp = Double.parseDouble(inData);
	
	String inData2;
	String type;
	//asking the user if their number is in celcius or fahrenheit
	System.out.println("is the temperature in celcius or fahrenheit if its celcius type 'c' if its in fahrenheit type 'f'");
	
	inData2 = stdin.readLine();
	//calling on methods
	Temperature Temp = new Temperature();
	
	Temp.setTemp(usertemp);//argument


        if (inData2.equals ("c"))
		System.out.println("The temperature in fahrenheit is " + Temp.convertF());
	else if (inData2.equals ("f"))
		System.out.println("The temperature in celsius is " + Temp.convertC());
	else 
		System.out.println("invalid temperature");
		
	
	}
}
	