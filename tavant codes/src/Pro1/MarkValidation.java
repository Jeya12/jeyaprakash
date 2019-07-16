package Pro1;

import java.util.Scanner;
public class MarkValidation {
	public static String isPass(int a)
	{
		if(a>=40)
			return "pass";
		else
			return "fail";
					
	}
	

	public static String markGrade(int a)
	{
		if(a>=90)
			return "Grade A";
		else if(a>=75&&a<90)
			return "Grade B";
		else if(a>=60&&a<75)
			return "Grade C";
		else
			return "Grade D";
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(isPass(a));
		System.out.println(markGrade(a));
	

	}

}
