import java.util.Scanner;

public class StudentSummary {

	public void summary(int[] examMark, int[] courseworkMark) {

		Scanner Student = new Scanner(System.in);
		// main method where I have initialised my arrays and stage average

		for (int i = 0; i < examMark.length; i++) {
			System.out.println("CSC102" + (i + 1) + " Exam Mark?");
			examMark[i] = Student.nextInt();
			System.out.println("CSC102" + (i + 1) + " Coursework Mark?");
			courseworkMark[i] = Student.nextInt();

		}
	}
}
