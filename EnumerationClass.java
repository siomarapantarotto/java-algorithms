// Java program to test Enumeration
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationClass {

	public static void main(String args[])
	{
		Enumeration months;
		Vector<String> monthNames = new Vector<>();

		monthNames.add("January");
		monthNames.add("February");
		monthNames.add("March");
		monthNames.add("April");
		monthNames.add("May");
		monthNames.add("June");
		monthNames.add("July");
		monthNames.add("August");
		monthNames.add("September");
		monthNames.add("October");
		monthNames.add("November");
		monthNames.add("December");
		months = monthNames.elements();

		while (months.hasMoreElements()) {
			System.out.println(months.nextElement());
		}
	}
}

