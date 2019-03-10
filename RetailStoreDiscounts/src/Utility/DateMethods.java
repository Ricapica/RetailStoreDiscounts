package Utility;

/*
 * This class will hold various Date manipulation methods.
 */


import java.util.Calendar;
import java.util.Date;

public class DateMethods {
	public static int getDiffYears(Date first, Date last) {
		//This method takes 2 dates, and returns the number of years between them. 
		//It is based on months between the 2 dates.
		Calendar a = getCalendar(first);
		Calendar b = getCalendar(last);
	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
	    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
	        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
	        diff--;
	    }
	    return diff;
	}
	public static Calendar getCalendar(Date date) {
		//Returns a calendar instance whose date is determined by the argument.
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return cal;
	}
}
