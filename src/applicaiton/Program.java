package applicaiton;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		stu.name = sc.nextLine();
		stu.note1 = sc.nextDouble();
		stu.note2 = sc.nextDouble();
		stu.note3 = sc.nextDouble();
		if (stu.finalNote() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", stu.finalNote());
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f%n", stu.finalNote());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", stu.failedNote());
		}
		sc.close();
	}


}
