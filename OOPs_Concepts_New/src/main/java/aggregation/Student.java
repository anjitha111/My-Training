package aggregation;

public class Student {
	int rnum;
	String name;
	Address address;////Declaring as a global variable.Non-primitive datatype created.
	
	public Student (int rnum,String name,Address address)
	{
		this.rnum=rnum;
		this.name=name;
		this.address=address;

	}
	public void print()
	{
		System.out.println("Roll number: "+rnum+ "," +"Name: "+name);
		System.out.println("Address details:"+address.hname+" " +address.street+" "+address.city);
	}
	
	public static void main(String[] args) {
		
		
		Address add1=new Address("House 41","Jayanagar","Bengaluru");
		Address add2=new Address("House 65","Love Shore","Frankfurt");
		Address add3=new Address("House 32","ERA Street","Cochin");
		Address add4=new Address("House 24","Stuttgarter street","Frankfurt");
		Address add5=new Address("House 45","Mainz street","Frankfurt");
		Student st1=new Student(10,"Namitha",add1);
		Student st2=new Student(20,"Varun",add2);
		Student st3=new Student(30,"Anagha",add3);
		Student st4=new Student(40,"Janki",add4);
		Student st5=new Student(50,"Vihaan",add5);
		System.out.println("Student details: ");
		st1.print();
		st2.print();
		st3.print();
		st4.print();
		st5.print();
	}

}
