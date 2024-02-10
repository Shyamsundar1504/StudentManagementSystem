package com.sms.studentdao;

import java.util.List;

import com.sms.stutentmodel.Student;

public interface StudentDao {
   List<Student> getAllStudent();
   public void insertStudent(Student student);
   public void deleteStudent(int id);
   public Student editStudent(int id);
   public void updateStudent(Student student);
}
