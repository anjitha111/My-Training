package abstractclass;

public class FullTimeEmployee extends Employee {
	final int working_hours=8;
    public FullTimeEmployee(int pay_per_hour) {
        super(pay_per_hour);
    }
    
    @Override
    public int calculateSalary() {
    	result= pay_per_hour* working_hours;
        return result;
    }
    public static void main(String[] args) {

        Employee con = new Contractor(100,9);
        Employee fte = new FullTimeEmployee(200);
        System.out.println("Contractor salary is "+con.calculateSalary());
        System.out.println("Full time employee salary is " +fte.calculateSalary());
    }
    
}