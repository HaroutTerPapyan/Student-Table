/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harout
 */

public class TableTest {
	public static void main(String[] args) throws TableException {
		Table <Integer, Student> contacts = new Table<Integer, Student>();
	
		contacts.tableInsert(10001, new Student(10001, "Dan", 22, "Computer Science"));
		contacts.tableInsert(10002, new Student(10002, "Bob", 56, "Computer Information Technology"));
		contacts.tableInsert(10003, new Student(10003, "Bill", 106, "Information Technology"));
		contacts.tableInsert(10004, new Student(10004, "Jill", 26, "Computer Science"));
		contacts.tableInsert(10005, new Student(10005, "Jane", 33, "Biology"));
		contacts.tableInsert(10006, new Student(10006, "Anne", 44, "Chemistry"));
		contacts.tableInsert(10007, new Student(10007, "Stacey", 90, "Mechanical Engineering"));
		contacts.tableInsert(10008, new Student(10008, "John", 86, "Electrical Engineering"));
		contacts.tableInsert(10009, new Student(10009, "Debbie", 116, "Civil Engineering"));
		contacts.tableInsert(10010, new Student(10010, "Mark", 73, "Information Technology"));
	
		contacts.printTable();
		
	}
}

