package demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import demo.dto.Student;

public class StudentDAO {
	
	private Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			
			return DriverManager.getConnection(url,user,pass);
			
		}catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public String SaveStudent(Student student) {
		try {
			//Connection connection=getConnection();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_first";
			String user="root";
			String pass="root";
			
			Connection connection=DriverManager.getConnection(url,user,pass);
			String query="INSERT INTO student VALUE (?,?,?,?)";
			
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getEmail());
			ps.setString(4, student.getIdCardNumber());
			
			int res=ps.executeUpdate();
			
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
		//return null;
	//}

  public Student getStudenttById(int id) {
	  String query="SELECT * FROM student WHERE id=?";
	  Connection connection =getConnection();
	  try {
		  PreparedStatement ps=connection.prepareStatement(query);
		  ps.setInt(1, id);
		  ResultSet resultSet=ps.executeQuery();
		  Student student=new Student();
		  
		  if(resultSet.next()) {
			  student.setId(resultSet.getInt(1));
			  student.setName(resultSet.getString(2));
			  student.setEmail(resultSet.getString(3));
			  student.setIdCardNumber(resultSet.getString(4));
		  }
		  connection.close();
		  return student;
	  }catch (SQLException e) { 
		  e.printStackTrace();
		
	}
	return null;
	  
  }


//public Student getStudentById() {
	// TODO Auto-generated method stub
	//return null;
//}

//public Student getStudentById() {
	// TODO Auto-generated method stub
	//return null;
//}
}

