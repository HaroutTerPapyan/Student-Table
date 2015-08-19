/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harout
 */

public class Student {

	String name;
	int UnitsEarned;
	String major;
	int StudentID;
	
	public Student(int s, String n, int u, String m){
		
		StudentID = s;
		name = n;
		UnitsEarned = u;
		major = m;
		
	}
	
	@Override
	public String toString() {
		return " Student " + "name: " + name + ", StudentID: " + StudentID +
				", major: " + major + ", UnitsEarned: " + UnitsEarned;
	}
	
}

