package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

	
	/** A singleton pattern object to access database. Volatile makes sure 
	 * multithread obj is correctly initialized*/
	private static volatile DatabaseConnection singleObj = null;
	
	/**
	 * Constructor instantiates a new database connection.
	 */
	private DatabaseConnection() {}
	
	/**
	 * Gets the single instance of DatabaseConnection. Uses singleton pattern
	 * to create an object to access the database class methods.
	 *
	 * @return single instance of DatabaseConnection
	 */
	public static DatabaseConnection getInstance() {
		if (singleObj == null) {
			synchronized (DatabaseConnection.class) {
				if (singleObj == null) {
					singleObj = new DatabaseConnection();
				}
			}
		}
		
		return singleObj;
	}
	
	public static Connection initializeDatabase()
		      throws SQLException, ClassNotFoundException
		  {
		           
		      // Database name to access
		      String dbURL = "jdbc:mysql://localhost:3306/445project";
		      //TODO: change this information to your own MySQL information:
		      String dbUsername = "root";
		      String dbPassword = "#BJHmMw2LK+PiA!";

		      try {
		      //Class.forName("com.mysql.jdbc.Driver");
		      Connection con = DriverManager.getConnection(dbURL,    //+ dbName
		                                                   dbUsername, 
		                                                   dbPassword);
		      return con;
		      
		      } catch(Exception e) {
		        System.out.println(e);
		        return null;
		      }
		  }
		  
		  /**
		   * Gets the states' and counties humidity, low_temp, high_temp, 
		   * regionNum, and UrbanCenter.
		   *
		   * @return the states
		   * @throws ClassNotFoundException the class not found exception
		   */
		  public static void getStatesInfo(String state, String county) throws ClassNotFoundException {
		    String query = "SELECT low_temp, high_temp, humidity, regionNum, UrbanCenter\r\n"
		        + "FROM states WHERE state = '" + state +"' and county = '" + county +"';";

		    try (Connection con = initializeDatabase();) {
		    	PreparedStatement st = con.prepareStatement(query);
			    ResultSet rs = st.executeQuery(query);

		        System.out.println("Connected successfully!");
		        while (rs.next()) {
//		          questions.regionNum = rs.getInt("regionNum");/
		          
		      }
		    } catch (SQLException e) {
		        System.out.println("Error while connecting to the database");
		    }
		  }
		  
		  
		  public static void getClient() throws ClassNotFoundException {
		    String query = "SELECT * FROM client";

		    try (Connection con = initializeDatabase();) {
		        PreparedStatement st = con.prepareStatement(query);
		        ResultSet rs = st.executeQuery(query);

		        System.out.println("Connected successfully!");
		        while (rs.next()) {
//		          questions.Fname = rs.getString("fname");
		          
		      }
		    } catch (SQLException e) {
		        System.out.println("Error while connecting to the database");
		    }
		  }
		   
		  public static void setClient(String Fname, String Lname, String email) throws ClassNotFoundException, SQLException {
		    //id++;
		    
		    String query = "INSERT INTO Client ";
		    
		    try (Connection conn = initializeDatabase();) {
		        
		        PreparedStatement st = conn.prepareStatement(query); 
		        st.executeUpdate(query);
		        

		    } catch (SQLException ex) {
		      System.out.println("Error while connecting to the database");
		    }  
		    
		    System.out.println("\nClients in database:");
		    getClient();
		}
}
