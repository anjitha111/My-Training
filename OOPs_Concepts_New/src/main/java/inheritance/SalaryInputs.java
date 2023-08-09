package inheritance;

import java.util.Scanner;

public class SalaryInputs {

int bp,ded,bon;

	public void salary()
	{
		 System.out.println("Please enter the basic pay.");
		 Scanner sc = new Scanner(System.in);
		 bp=sc.nextInt();
		 System.out.println("Entered basic pay is "+bp);
	
		 System.out.println("Please enter the deduction amount.");
		 ded=sc.nextInt();
		 System.out.println("Entered deduction is "+ded);

		 System.out.println("Please enter the bonus.");
		 bon=sc.nextInt();
		 System.out.println("Entered bonus is "+bon);
	
	}
}
