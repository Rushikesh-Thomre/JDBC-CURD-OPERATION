package preparedstatementDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class preparedstatementDAO {

	public void insert() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement ps = connection.prepareStatement("insert into student(id,name)values (?,?)");

		ps.setInt(1, 10);
		ps.setString(2, "Apple");
		ps.executeUpdate();

		ps.setInt(1, 20);
		ps.setString(2, "pie-apple");
		ps.executeUpdate();

		ps.setInt(1, 30);
		ps.setString(2, "orange");
		ps.executeUpdate();

		ps.setInt(1, 40);
		ps.setString(2, "mango");
		ps.executeUpdate();

		System.out.println("data inserted");
		connection.close();

	}

	public void update() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement ps = connection.prepareStatement("update student set name=? where id=? ");

		ps.setString(1, "drygenfood");
		ps.setInt(2, 40);
		ps.executeUpdate();

		ps.setString(1, "carrot");
		ps.setInt(2, 30);
		ps.executeUpdate();

		System.out.println("data updated");
		connection.close();

	}

	public void delete() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

		PreparedStatement ps = connection.prepareStatement("delete from student where id=?");

		ps.setInt(1, 1);
		ps.executeUpdate();
		
		ps.setInt(1, 2);
		ps.executeUpdate();
		
		ps.setInt(1, 3);
		ps.executeUpdate();
		
		ps.setInt(1, 4);
		ps.executeUpdate();
		
		ps.setInt(1, 5);
		ps.executeUpdate();

		System.out.println("data deleted");
	}

	public void select() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "root");

		PreparedStatement ps = connection.prepareStatement("select * from student");

		ResultSet rs = ps.executeQuery();

		System.out.println("data selected");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2));

		}

		connection.close();

	}

}
