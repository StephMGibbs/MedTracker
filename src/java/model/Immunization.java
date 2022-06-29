/**
 * 
 */
package java.model;

/**
 * @author still
 *
 */
public class Immunization {

	/**
	 * Shots taken, report that it has been taken and this shot status
	 * is up to date & completed.
	 */
	protected static void addShotTaken() {
		
	}
	
	/**
	 * Calculate when shots are needed to be taken based on which ones where already
	 * received.
	 */
	protected static void shotNeededCalcAdult() {
		String fluShot;
		String covidShot;
	}
	
	/**
	 * Shots taken from birth to 18 years old.
	 * Based on CDC recommendations: https://www.cdc.gov/vaccines/schedules/hcp/imz/child-adolescent.html
	 */
	protected static void shotsTakenBirthToTeen() {
		String HepB, RV, DTaP, Hib,  PCV13, IPV, MMR, VAR, HepA, Tdap,
		HPV, MenACWY;
	}
	
	/**
	 * Current shots taken. User will enter what shots that were taken recently.
	 * Date taken is YYYY-MM-DD format.
	 */
	protected static void currentShotsTaken(String shot, String dateReceived) {
		
	}
	
	/**
	 * List shots taken.
	 */
	protected static void listShotsTaken() {
		
	}
	
	/**
	 * List shots needed.
	 */
	protected static void listShotsNeeded() {
		
	}
}
