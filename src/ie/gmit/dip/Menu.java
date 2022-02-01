package ie.gmit.dip;

import java.util.*;

public class Menu {
	private StudentManager sm = new StudentManager();
	private Scanner s;
	private boolean keepRunning = true;

	public Menu() {
		s = new Scanner(System.in);
	}

	public void start() {

		while (keepRunning) {
			showOptions();
			int choice = Integer.parseInt(s.next());
			if (choice == 1) {
				add();
			} else if (choice == 2) {// add
				delete();
			} else if (choice == 3) {// delete
				searchByID();
			} else if (choice == 4) {// Search ID
				searchByFirstName();
			} else if (choice == 5) {// Search Name
				total();
			} else if (choice == 6) {// total
				System.out.println("Shutting down");
				keepRunning = false;
			} else {
				System.out.println("ERROR Invalid input.");
			}
		}
	}

	private void add() {
		System.out.println("[INFO] Add a Student");
		System.out.println("[INFO] Enter Student ID:");
		String id = s.next();

		System.out.println("[INFO] Enter Student First Name:");
		String fname = s.next();

		System.out.println("[INFO] Enter Student Surname:");
		String surname = s.next();
		s.nextLine();
		Date d = new Date();
		Student s1 = new Student(id, fname, surname, d);
		sm.add(s1);

		System.out.println("[INFO] Enter Address:");
		String address = s.next();
		s1.setAddress(new Address(s.nextLine()));

		System.out.println("[INFO] Enter Course:");
		s1.setCourse(new Course(s.nextLine()));

		boolean added = sm.add(s1);
		if (added) {
			System.out.println("[INFO] Student Added, there are now " + sm.size() + " Left on file");
		} else {
			System.out.println("[Error] Student not Added");
		}
	}

	private void delete() {
		System.out.println("[INFO] Delete a Student");

		System.out.println("[INFO] Enter Student ID:");
		String id = s.next();
		boolean deleted = sm.delete(id);
		if (deleted) {
			System.out.println("[INFO] Student Deleted, there are now " + sm.size() + " Left on file");
		} else {
			System.out.println("[INFO] Student not Deleted");
		}
	}

	private void searchByID() {
		System.out.println("[INFO] Search by Student ID");
		System.out.println("[INFO] Enter Student ID:");
		String id = s.next();

		Student s1 = sm.getStudentById(id);
		if (s1 != null) {
			System.out.println(s1);
		} else {
			System.out.println("[Error] Student not found");
		}
	}

	private void searchByFirstName() {
		System.out.println("[INFO] Search by Student First Name");
		System.out.println("[INFO] Enter Student Name:");
		String name = s.next();

		Student[] students = sm.getStudentsByFirstName(name);
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

	private void total() {
		System.out.println("[INFO] Get Total Number of Students");
		int total = sm.size();
		System.out.println("[INFO] See Total Number of Students:" + total);
	}

	private void showOptions() {
		System.out.println("-------------------------");
		System.out.println("-- Student Manager 3.0 --");
		System.out.println("-------------------------");
		System.out.println("(1) Add Student");
		System.out.println("(2) Delete Student");
		System.out.println("(3) Search for Student by ID");
		System.out.println("(4) Search for Student by First Name");
		System.out.println("(5) Get Total Number of Students");
		System.out.println("(6) Quit");
		System.out.println("Select and Option [1-5]>");
	}

}
