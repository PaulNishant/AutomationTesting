package javaproject;

public class firstassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Store marks of 3 sub
        int math = 85;
        int science = 90;
        int english = 88;

        // Calculate the total marks
        int total = math + science + english;

        //  Calculate the average
        double average = total / 3.0;
        
        //  Print both the total and average
        System.out.println("Total Marks:" +total);
        System.out.println("Average Marks:" + average);

        // Change average to int and note the diff
        int averageInt = total / 3;
        System.out.println("Average Marks: " + averageInt);
	}

}
