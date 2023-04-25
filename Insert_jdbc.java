package JDBC;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;

	public class Insert_jdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //register driver-step 1
		//connection driver manager
			Connection conn=DriverManager.getConnection
	   ("jdbc:mysql://localhost:3307/4119db","root","root"); //step 2
			Statement stmt=conn.createStatement(); //create statement step 3
			//inserting data into database table //step 4
			stmt.executeUpdate
			("insert into Student1 values(10,'Nisha','sana77saifi@gmil.com'),"
			+"(11,'megha','meghatomar@gmail.com')");
		 System.out.println("inserted sucessfully");
		 conn.close(); //step 5
		}
		catch(Exception e) {
			System.out.println(e);
		}
	  }
	}

