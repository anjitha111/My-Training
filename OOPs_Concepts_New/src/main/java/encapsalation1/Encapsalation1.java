package encapsalation1;

public class Encapsalation1 { //Encapsalation class

	private String name;
	private int age;
	
	public void setter(int age,String name) //To view
	{
		this.age=age;
		this.name=name;
	}

	public void getter()//To modify
	{
		System.out.println("Name is "+name);
		age=age*2;
		System.out.println("Age is "+age);
	}
}
