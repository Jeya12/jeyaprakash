package Pro1;
import java.util.Scanner;

public class MarkValidationswitchcase {

	public static String markGrade(int a)
	{
		for(int i=1;i<=4;i++)
		{
			switch(i)
			{
			case 1: if(a>=90) return "Grade A";
			break;
			case 2: if(a>=75&&a<90) return "Grade B";
			break;
			case 3: if(a>=60&&a<75) return "Grade C";
			break;
			case 4: if(a<60) return "Grade D";

			}
		}
			return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Mark");
		a=sc.nextInt();
		System.out.println(markGrade(a));

	}

}
