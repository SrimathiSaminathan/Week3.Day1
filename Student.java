package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name");
	}
	public void studentDept()
	{
		System.out.println("Student Dept");
	}
	public void studentId()
	{
		System.out.println("Student ID");
	}
	//Called all methods by Multilevel Inheritance
	public static void main(String args[])

	{
		Student details = new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentDept();
		details.studentId();
	}
}
