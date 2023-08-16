package abstractclass;

public class Contractor extends Employee {

    public Contractor(int pay_per_hour, int work_hours) {
        super(pay_per_hour);
        this.work_hours=work_hours;
    }
    @Override
    public int calculateSalary() {
    	result= pay_per_hour* 8;
        return result;
    }
}