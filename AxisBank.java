package week3.day1;

import org.system.Desktop;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit in Axis Bank");
	}
	public static void main(String args[])
	
	{
		AxisBank Acc = new AxisBank();
		Acc.saving();
		Acc.fixed();
		Acc.deposit();
	}
}
