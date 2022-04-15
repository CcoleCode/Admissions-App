import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	//Constructor prompts user to enter students name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println(" 1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
		
		
	}
	
	//Generate Id
	private void setStudentID() {
	//Grade Level + ID
		id++;
		this.studentID = gradeYear + ""+ id;
		
	}
	
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (0 to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else { 
			break;
			}
	} while (1 != 0);
	
	}
	
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank your for your payment of $" + payment);
		viewBalance();
	}
	
	//Show Status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}

}
