// Author: Nicholas Haley
// Student number: 150108595
// Date: 11/11/2015
// Purpose: Mark Calculator - Project 1 - CSC1021 Programming 1

public class MarkCalculator {

	public static void main(String[] args) {

		int[] examMark = new int[6];
		int[] courseworkMark = new int[6];

		StudentSummary Input = new StudentSummary();
		Input.summary(examMark, courseworkMark);

		int[] computedModuleMark = computeMarks(examMark, courseworkMark);
		int computedStageAverage = computeResult(computedModuleMark);

		StudentChart Graph = new StudentChart();
		Graph.draw(computedModuleMark);

	}

	public static int[] computeMarks(int[] examMark, int[] courseworkMark) {

		int[] weighting = { 50, 40, 100, 50, 20, 35 };
		int[] computedModuleMark = new int[6];

		System.out.println("Mark   Result");

		// for loop to calculate the computed module mark for the student

		for (int i = 0; i < courseworkMark.length; i++) {
			computedModuleMark[i] = ((courseworkMark[i] * weighting[i]) + (examMark[i] * (100 - weighting[i]))) / 100;

			// if statement to decide whether a module is Pass, Compensatable
			// Fail or Fail

			if (computedModuleMark[i] >= 40) {
				System.out.println(computedModuleMark[i] + "      Pass");
			} else if (computedModuleMark[i] >= 35) {
				System.out.println(computedModuleMark[i] + "      Compensatable Fail");
			} else {
				System.out.println(computedModuleMark[i] + "      Fail");
			}
		}
		return computedModuleMark;
	}

	public static int computeResult(int[] computedModuleMark) { // Compute Stage
																// result }

		int sum = 0;

		for (int j : computedModuleMark) { // For loop to calculate stage result
			// for every module in the arrays
			sum += j;
		}
		int computedStageAverage = (sum / 6);
		int PassessByCompensation = 0;
		
		
		
		System.out.println("");
		System.out.print("Stage Average = " + computedStageAverage);
		
	
	
		
		 //computedStageAverage = pass if all modules are > 40
		 //computedStageAverage = pass by compensation if 4 modules pass and only 2 modules pass by compensation
		 //computedStageAverage = else fail
	
		 
		
		if (computedStageAverage >= 40) {
			System.out.print(" Pass ");
		} else if (computedStageAverage >= 38) {
			System.out.print(" Pass by Compensation ");
		} else 
			System.out.print(" Fail ");
		
		
		
	
		return computedStageAverage;

	}
	}
