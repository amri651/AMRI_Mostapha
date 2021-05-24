
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InteractionDataBase {
	static Connection c=null;
	static Statement n = null;
	public InteractionDataBase() {
	}
         
	public static void connect(){
      try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
         n=c.createStatement();
	  } 
      catch (ClassNotFoundException ex) {
    	  System.out.println("Error: unable to load driver class!");
	  } 
      catch (SQLException ex) {
    	  System.out.println("Error: Statement is null!"); 
      }  
	}
	
	public static ResultSet select(String sql) {
		ResultSet p =null;
		try {
			p = n.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	             
	
	public static void misajour(String sql) {
	    try {
			n.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		    }
	}

	public static void disconnect() {
		try {
			if(c != null)
				c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(n != null)
				n.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

