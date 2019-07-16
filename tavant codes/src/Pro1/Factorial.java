package Pro1;

import java.util.Scanner;

class Factorial {
		// TODO Auto-generated constructor stub
		static int CalculateFactorial(int x)
		{
			int i,a=1;
			for(i=1;i<=x;i++)
			{
				a=a*i;
			}
			return a;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int b;
		System.out.println("Enter the number:");
		b=sc.nextInt();
		System.out.println("Factorial = "+CalculateFactorial(b));

	}

}
