package com.sms.Studentdaoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sms.studentdao.StudentDao;
import com.sms.stutentmodel.Student;

public class StudentDaoImpl implements StudentDao {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/sms";

	static final String USER = "root";
	static final String PASS = "root";

	static final String GETALLINFO = "Select * from student";
	static final String INSERTINFO = "insert into student(name,email,dob) values(?,?,?)";
	static final String DELETEINFO = "delete from student where id=?;";
	static final String EDITBYID = "select * from student where id=?;";
	static final String UPDATEINFO = "update  student set name=?, email=?, dob=? where id=?;";
	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
		}
		return con;
	}

	public List<Student> getAllStudent() {
		 List<Student> student= new ArrayList<>();
            try(Connection con=getCon();
            		PreparedStatement  ps= con.prepareStatement(GETALLINFO)){
            	   ResultSet rs=ps.executeQuery();
            	   while(rs.next()) {
            		   int id = rs.getInt("id");   
            		   String name =rs.getString("name");
            		   String email=rs.getString("email");
            		   String dob=rs.getString("dob");
            		student.add(new Student(id,name,email,dob));   
            	   }
            }catch(Exception e) {e.printStackTrace();}
		return student;
	}

	@Override
	public void insertStudent(Student student) {
		
		try(Connection con=getCon();
				PreparedStatement  ps= con.prepareStatement(INSERTINFO);){
			
			String name=student.getName();
			String email=student.getEmail();
			String dob= student.getDob();
			
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,dob);
			ps.executeUpdate();
					
			
		} catch (SQLException e) {e.printStackTrace();}
		
	}

	@Override
	public void deleteStudent(int id) {
		try(Connection con=getCon();
				PreparedStatement ps=con.prepareStatement(DELETEINFO)){
			ps.setInt(1,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public Student editStudent(int id) {
		Student student=null;
		try(Connection con = getCon();
				PreparedStatement ps=con.prepareStatement(EDITBYID)){
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String name= rs.getString("name");
				String email=rs.getString("email");
				String dob=rs.getString("dob");
				student= new Student(id,name,email,dob);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		try(Connection con=getCon();
				PreparedStatement ps=con.prepareStatement(UPDATEINFO)){
			
			ps.setString(1, student.getName());
			ps.setString(2,student.getEmail());
			ps.setString(3,student.getDob());
			ps.setInt(4,student.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
