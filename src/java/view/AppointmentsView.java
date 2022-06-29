/**
 * 
 */
package java.view;

import java.model.Appointments;
import java.util.Scanner;

/**
 * @author still
 *
 */
public class AppointmentsView {
	
	/** The scanner to take in user input. */
	static Scanner scnr = new Scanner(System.in);
	
	/**
	 * Gets the calendar to display for entered month and year.
	 *
	 * @return the calendar
	 */
	public void displayCalendar(Appointments apt) {
		System.out.println("Year: ");
		int year = scnr.nextInt();
		apt.setYear(year);
		
		System.out.println("Month: ");
		int month = scnr.nextInt();
		apt.setMonthAsInt(month);
		
		//make visual calendar:
		
		
	}
	
	/**
	 * Display all appointments.
	 *
	 * @param apt the apt
	 */
	public void displayAllAppointments(Appointments apt) {
		
	}
	
	/**
	 * Adds appointments.
	 *
	 * @param apt the apt
	 */
	public void addAppointment(Appointments apt) {
		
	}
}
