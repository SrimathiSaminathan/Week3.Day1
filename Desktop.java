package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()	
	{
		System.out.println("Desktop Size");
	}
	//Called by single Inheritance
	public static void main(String args[])
	
	{
		Desktop Comp = new Desktop();
		Comp.computerModel();
		Comp.desktopSize();
	}

}
