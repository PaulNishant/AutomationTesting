package javaproject;

public class Assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Accept marks for 3 subjects
        System.out.print("Enter Math marks: 75");
        int math = 75;

        System.out.print("Enter Science marks: 60");
        int science = 60;

        System.out.print("Enter English marks: 30");
        int english = 30;

        // Calculate total and average
        int total = math + science + english;
        double average = total / 3.0;

        // Print average
        System.out.printf("Average Marks: %.2f\n", average);

        // Determine grade
        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);

        // Custom message based on grade
        if (grade.equals("Fail")) {
            System.out.println("Please work harder next time.");
        } else if (grade.equals("A+") || grade.equals("A")) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving.");
        }

        // Bonus: Check if any individual subject is below 35
        if (math < 35 || science < 35 || english < 35) {
            System.out.println("Failed due to low score in at least one subject.");
        }

        
	}

}
