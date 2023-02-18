package studentManangementSystem;
import java.util.*;
public class Student {
private String firstName;
private String lastName;
private int gradeYear;
private String studentID;
private String courses="";
private  int tutionBalance=0;
private int costOfCourse = 12000;
private static int id =1000;
Scanner sc = new Scanner(System.in);
// Enter  student name and year from prompt
Student(){
	System.out.println("Enter the First Name of Student:");
	this.firstName= sc.nextLine();
	System.out.println("Enter the last Name of Student:");
	this.lastName = sc.nextLine();
	System.out.println("Enter the Year of Student :\n1 -1st year\n2 -Second Year\n3 -Third Year\n 4 - Final Year");
	this.gradeYear= sc.nextInt(); 
	createStudentID();
	System.out.println(this.firstName);
	System.out.println(this.lastName);
	System.out.println(this.lastName);
	System.out.println(this.gradeYear);
	System.out.println(this.studentID);
}
//Generate ID
private void createStudentID() {
	id++;
	this.studentID = this.gradeYear+""+id;
}
//Enroll to courses:
public void enroll() {
	
	do {
		System.out.println("Enter the Course you want to enroll:(press Q to quit)");
		 String course = sc.nextLine();
		if(!course.equalsIgnoreCase("q")) {
			courses = courses+"\n"+course;
			tutionBalance += costOfCourse;
		}
		else {
			break;
		}
	}
	while(1!=0);
	System.out.println(courses);
}
// View Balance 
public void viewBalance() {
	System.out.println("the total balance is :"+ tutionBalance);
}
// pay tution 
public void payTution() {
	viewBalance();
	System.out.println("Enter your Payment:");
	int payment = sc.nextInt();
	 tutionBalance-= payment;
	System.out.println("thank you for the payment :"+payment);
	viewBalance();
}
// Show info
public String showInfo() {
	return "Name" + firstName +" "+lastName +"\nCourses Enrolled:"+courses + "\n Balance"+ tutionBalance; 
}
}
