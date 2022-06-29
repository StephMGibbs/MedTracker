/**
 * 
 */
package java.controller;

import java.model.Appointments;
import java.view.AppointmentsView;

/**
 * @author still
 *
 */
public class AppointmentsController {
	
	/** The model object. */
	private Appointments apt;
	
	/** The view object. */
	private AppointmentsView view;
	
	/**
	 * Constructor instantiates a new appointments controller.
	 *
	 * @param apt the apt
	 * @param view the view
	 */
	public AppointmentsController(Appointments apt, AppointmentsView view) {
		super();
		this.apt = apt;
		this.view = view;
	}
	
	/**
	 * Update view class with new model information.
	 */
	public void updateView() {
		view.displayCalendar(apt);
		view.displayAllAppointments(apt);
	}
	
	/**
	 * Gets the weekdays.
	 *
	 * @return the weekdays
	 */
	public String[] getWeekdays() {
		return apt.getWeekdays();
	}
	
	/**
	 * Gets the months.
	 *
	 * @return the months
	 */
	public String[] getMonths() {
		return apt.getMonths();
	}
	
	/**
	 * Gets the month last day (like 30 or 31).
	 *
	 * @return the month last day
	 */
	public int[] getMonthLastDay() {
		return apt.getMonthLastDay();
	}
	
	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public int getYear() {
		return apt.getYear();
	}
	
	/**
	 * Gets the day.
	 *
	 * @return the day
	 */
	public int getDay() {
		return apt.getDay();
	}
	
	public int getMonthAsInt() {
		return apt.getMonthAsInt();
	}
	
	/**
	 * Sets the year.
	 *
	 * @param year the year
	 */
	public void setYear(int year) {
		apt.setYear(year);
		updateView();
	}
	
	/**
	 * Sets the day.
	 *
	 * @param day the new day
	 */
	public void setDay(int day) {
		apt.setDay(day);
		updateView();
	}
	
	/**
	 * Sets the month as int.
	 */
	public void setMonthAsInt(int monthAsInt) {
		apt.setMonthAsInt(monthAsInt);
		updateView();
	}
	
	/**
	 * Sets the feb last day.
	 *
	 * @param monthLastDay the new feb last day
	 */
	public void setFebLastDay() {
		apt.checkFebLeapYear(getYear());
		updateView();
	}
}
