package Pro1;

import java.util.Scanner;
public class SumofNumbers {

	static int SumOfEvenNumber(int x,int y)
	{
		int i,z=0;
		for(i=x;i<=y;i++)
		{
			if(i%2==0)
			{
				z=z+i;
			}
		}
		return z;
	}

	
	static int SumOfOddNumber(int x,int y)
	{
		int i,z=0;
		for(i=x;i<=y;i++)
		{
			if(i%2!=0)
			{
				z=z+i;
			}
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int f,l;
System.out.println("First=");
f=sc.nextInt();
System.out.println("Last=");
l=sc.nextInt();
System.out.println("Sumofeven="+SumOfEvenNumber(f,l));
System.out.println("Sumofeodd="+SumOfOddNumber(f,l));

	}

}
