/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise01_HoursAndWages {

	public static final double RATEOFPAY = 10.25;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hoursWorked = new int[] { 8, 7, 9, 7, 4 };

		double totalHoursWorked = 0;

		printArrayToConsole(hoursWorked);
		totalHoursWorked = calculateTotalHoursWorked(hoursWorked);
		System.out.println("Total Hours Worked: " + totalHoursWorked);
		finalWeeklySalary(totalHoursWorked);

	}

	/**
	 * This method prints the finalWeeklySalary to the console.
	 * 
	 * @param totalHoursWorked
	 */
	public static void finalWeeklySalary(double totalHoursWorked) {
		double finalWeeklySalary = 0;

		finalWeeklySalary = totalHoursWorked * RATEOFPAY;
		System.out.println("Final Weekly Salary: " + finalWeeklySalary);
	}

	/**
	 * This Method calculates and returns the total hours worked
	 * 
	 * @param hoursWorked - Array of hours worked
	 * @return - Returns totalHoursWorked
	 */
	public static double calculateTotalHoursWorked(int[] hoursWorked) {
		double totalHoursWorked = 0;

		for (int i = 0; i < hoursWorked.length; i++) {
			totalHoursWorked += hoursWorked[i];
		}
		return totalHoursWorked;
	}

	/**
	 * This method prints an Array to Console - not zero indexed to improve customer
	 * readability
	 * 
	 * @param hoursWorked - array containing the hours worked
	 */
	public static void printArrayToConsole(int[] hoursWorked) {
		System.out.println("Day\tHours Worked");
		for (int i = 0; i < hoursWorked.length; i++) {
			System.out.println((i + 1) + "\t" + hoursWorked[i]);
		}
	}

}
