/**
 * 
 */
package java.model;

import java.util.Scanner;

/**
 * @author still
 *
 */
public class Appointments {
	
	/** Array of the weekdays: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, & Saturday. */
	private String weekdays[]   = { "SUN","MON","TUE","WED","THU","FRI","SAT" } ;  
	
	/** Array of the months. */
	private String months[] = { "JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER" } ; 
	
	/** Array of each month's last day (EX: January last day is 31). */
	private int monthLastDay[] = { 31,29,31,30,31,30,31,31,30,31,30,31 } ;
	
	/** The year for appointments. */
	private int year;
	
	/** The day for appointments (EX: 01 to 30). */
	private int day;
	
	/** The month as integer (EX: January is 01 & December is 12). */
	private int monthAsInt;
	
	/**
	 * Constructor instantiates new Appointments objects.
	 *
	 * @param weekdays the weekdays
	 * @param months the months as a string
	 * @param monthLastDay the month last day
	 * @param year the year
	 * @param day the day
	 * @param monthAsInt the month as an integer
	 */
	public Appointments(String weekdays[], String months[], int monthLastDay[],
			int year, int day, int monthAsInt) {
		super();
		this.weekdays = weekdays;
		this.months = months;
		this.monthLastDay = monthLastDay;
		this.year = year;
		this.day = day;
		this.monthAsInt = monthAsInt;
	}
	
	/**
	 * Gets the weekdays.
	 *
	 * @return the weekdays
	 */
	public String[] getWeekdays() {
		return weekdays;
	}
	
	/**
	 * Gets the months.
	 *
	 * @return the months
	 */
	public String[] getMonths() {
		return months;
	}
	
	/**
	 * Gets the month last day (like 30 or 31).
	 *
	 * @return the month last day
	 */
	public int[] getMonthLastDay() {
		return monthLastDay;
	}
	
	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Gets the day.
	 *
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	public int getMonthAsInt() {
		return monthAsInt;
	}
	
	/**
	 * Sets the year.
	 *
	 * @param year the year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Sets the day.
	 *
	 * @param day the new day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * Sets the month as int.
	 */
	public void setMonthAsInt(int monthAsInt) {
		this.monthAsInt = monthAsInt;
	}
	
	/**
	 * Sets the feb last day.
	 *
	 * @param monthLastDay the new feb last day
	 */
	public void setFebLastDay(int monthLastDay) {
		this.monthLastDay[1] = monthLastDay;
	}
	
	/**
	 * Check February leap year, and update monthLastDay array to correct day.
	 *
	 * @param year the year
	 */
	public void checkFebLeapYear(int year) {
		//check leap year
		if (year%4 == 0 && year%100 != 0 || year%100 == 0) {
			//leap year, store 29
			setFebLastDay(29);
		} else {
			setFebLastDay(28);
		}
	}
}
