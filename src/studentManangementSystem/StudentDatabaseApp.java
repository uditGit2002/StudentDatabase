package studentManangementSystem;
import java.util.*;
public class StudentDatabaseApp {
 public static void main(String []args) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the numeber of new students to enroll:");
	 int numberOfStudents = sc.nextInt();
	 Student[] s = new Student[numberOfStudents];
	 for(int i=0;i<numberOfStudents;i++) {
		  s[i] = new Student();
		 s[i].enroll();
		 s[i].payTution();
		 
	 }
	 for(int i=0;i<numberOfStudents;i++)
	 System.out.println(s[i].showInfo());
 }
}
