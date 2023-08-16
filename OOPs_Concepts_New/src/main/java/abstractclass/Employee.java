package abstractclass;

public abstract class Employee {

    int pay_per_hour,work_hours,result;

    public Employee(int pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public abstract int calculateSalary();
    
    }
  