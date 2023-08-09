package inheritance;

public class TotalSalary extends CalculationSal{

	float tot=0;
	public void totsal()
	{
		tot=bp+hra-pf-ded+bon;
		System.out.println("Salary Slip");
		System.out.println ("Basic pay: " + bp +
                 "\nDe1duction: " + ded +
                 "\nHRA: " + hra +
                 "\nPF: " + pf +
                 "\nBonus: " + bon +
                 "\nTotal salary: " + tot);
		
	}
	public static void main(String[] args) {
		TotalSalary tot=new TotalSalary();
		tot.salary();
		tot.calc();
		tot.totsal();
		
	}

}
