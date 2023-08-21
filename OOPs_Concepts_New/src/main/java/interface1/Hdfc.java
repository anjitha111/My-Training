package interface1;

import java.util.Scanner;

public class Hdfc implements Rbi {
	static int deposit=0;
	static int dur;

	public static void main(String[] args) {
		Hdfc hd=new Hdfc();
		hd.recurringDeposit(5000,5);

	}

	@Override
	public void recurringDeposit(int deposit,int dur) {
		float tot_amt=deposit+(deposit*(1+interest_rate/dur));
		System.out.println("Maturity amount of recurring deposit is "+tot_amt);
		
	}



}
