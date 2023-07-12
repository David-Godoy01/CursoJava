import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		int rowsAffected;
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			//Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "root", "123456");
			
			//create a statement object to send to  the database
			Statement statement = conn.createStatement();
			
			//Execute the statement object
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5500 WHERE id = 600;");
		
			//Process the result
			System.out.println("Executed an update statement - Rows Affected "+ rowsAffected);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while updating");
		}
	}

}

//int salaryTotal =0;
//while(resultSet.next()) {
//salaryTotal = salaryTotal + Integer.parseInt( resultSet.getString("salary"));
//}
//System.out.println(salaryTotal);


