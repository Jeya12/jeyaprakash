package Pro1;
import java.util.Scanner;
public class Temperature {

	static double convertToFarenheit(double a)
	{
		return (a*9/5)+32;
	}
	static double convertToCelsious(double b)
	{
		return (b-32)*9/5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Celsious =");
		double a,b;
		a=sc.nextDouble();
		System.out.println("Farenheit =");
		b=sc.nextDouble();
		System.out.println("Convert to Farenheit ="+convertToFarenheit(a));
		System.out.println("Convert to Celsious ="+convertToCelsious(b));


	}

}
