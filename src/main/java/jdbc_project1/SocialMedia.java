package jdbc_project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SocialMedia {
	Connection connection = new ConnectionObject().getConnection();

	private User user;

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public void signUp(User user) throws Exception
	{

		String query= "insert into User value(?,?,?,?,?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(query);

		statement.setString(1, user.getEmail());
		statement.setString(2, user.getFirstname());
		statement.setString(3, user.getLastname());
		statement.setString(4, user.getPassword());
		statement.setLong(5, user.getMobile());
		statement.setString(6, user.getGender());
		statement.setString(7, user.getStatus());
		statement.setString(8, user.getDOB());

		statement.executeUpdate();
		connection.close();
		System.out.println("==========Signup Successfull=========");

	}

	public void logIn(String email,String password,User user) throws Exception
	{
		String query="select * from User where email=? and password=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, user.getEmail());
		preparedStatement.setString(2, user.getPassword());

		ResultSet resultset= preparedStatement.executeQuery();
		String email1="";
		String password1="";

		/*
		 * while(resultset.next()) { System.out.println(resultset.getString(1));
		 * System.out.println(resultset.getString(2));
		 * System.out.println(resultset.getString(3)); passwrd=resultset.getString(4);
		 * System.out.println(resultset.getString(4));
		 * System.out.println(resultset.getLong(5));
		 * System.out.println(resultset.getString(6));
		 * System.out.println(resultset.getString(7));
		 * System.out.println(resultset.getString(8)); }
		 */
		if(password1.equals(user.getPassword()) && email1.equals(user.getEmail()))
		{
			System.out.println("******You are logged in successfully******");


		}
		else {
			System.out.println("******Invalid Id or Password*****");
		}

	}

}


