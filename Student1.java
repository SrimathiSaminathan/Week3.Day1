package week3.day1;

public class Student1 {
	
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println(email);
		System.out.println(phoneNumber);
	}
	public static void main(String args[])
	
	{
		Student1 details = new Student1();
		details.getStudentInfo(5);
		details.getStudentInfo(6,"Srimathi");
		details.getStudentInfo("srimathi@testingteam.com",987654321);
	}
}
