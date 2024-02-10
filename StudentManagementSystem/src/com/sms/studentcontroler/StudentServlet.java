package com.sms.studentcontroler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.Studentdaoimpl.StudentDaoImpl;
import com.sms.stutentmodel.Student;
@WebServlet("/")
public class StudentServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	StudentDaoImpl sdi;
	@Override
	public void init() throws ServletException {
		sdi=new StudentDaoImpl();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getServletPath();
		switch(action) {
		case "/list":
			getAllStudent(req , resp);
			break;
		case "/insert":
			insertStudent(req, resp);
			break;
		case "/delete":
			deleteStudent(req, resp);
			break;
		case "/edit":
			editStudent(req, resp);
			break;
		case "/update":
			updateStudent(req, resp);
			break;
		case "/register":
			registerStudent(req, resp);
			break;
			
			default :
			getAllStudent(req , resp);
			break;
		}
	}

	private void registerStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
	private void updateStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dob=req.getParameter("dob");
		Student updateStudent= new Student(id,name,email,dob);
		sdi.updateStudent(updateStudent);
		resp.sendRedirect("list");
		
	}
	private void editStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		Student editStudent=sdi.editStudent(id);
		req.setAttribute("student1", editStudent);
		req.getRequestDispatcher("form.jsp").forward(req, resp);
		
	}
	private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		sdi.deleteStudent(id);
		resp.sendRedirect("list");
		
	}
	private void insertStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		  String name= req.getParameter("name");
		  String email= req.getParameter("email");
		  String dob= req.getParameter("dob");
		  Student insertStudent= new Student(name,email,dob);
		  sdi.insertStudent(insertStudent);
		  resp.sendRedirect("list");
	
	}
	private void getAllStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> student= sdi.getAllStudent();
		req.setAttribute("student", student);
		req.getRequestDispatcher("student.jsp").forward(req, resp);
		
	}

	
	
	
}
