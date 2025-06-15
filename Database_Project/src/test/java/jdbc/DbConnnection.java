package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root", "root");
		Statement stmt =con.createStatement();
		// for insert, update, delete user executeUpdate
		stmt.executeUpdate("Insert into customer (name,phone,email) values ( 'Vaidehi Krishna', '8888908888','vaidehi@example.com')");
		// for select/read use executeQuery
		ResultSet result = stmt.executeQuery("select * from customer;");
		while (result.next()){
		System.out.println("Customer Id " + result.getInt("cid"));
		System.out.println("Customer name " + result.getString("name"));
		System.out.println("Customer name " + result.getString("phone"));
		}
	}

}