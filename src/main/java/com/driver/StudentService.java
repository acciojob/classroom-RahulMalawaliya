package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository res;

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		res.addStudent(student);
	}

	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		res.addTeacher(teacher);
		
	}

	public void addStudentTeacherPair(String student, String teacher) {
		// TODO Auto-generated method stub
		res.addStudentTeacherPair(student,teacher);
		
	}

	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		
		return res.getStudentByName(name);
	}

	public Teacher getTeacherByName(String name) {
		// TODO Auto-generated method stub
		return res.getTeacherByName(name);
	}

	public List<String> getAllStudents() {
		// TODO Auto-generated method stub
		return res.getAllStudents();
	}

	public List<String> getStudentsByTeacherName(String teacher) {
		// TODO Auto-generated method stub
		return res.getStudentsByTeacherName(teacher);
	}

	public void deleteTeacherByName(String teacher) {
		// TODO Auto-generated method stub
		res.deleteTeacherByName(teacher);
		
	}

	public void deleteAllTeachers() {
		// TODO Auto-generated method stub
		res.deleteAllTeachers();
		
	}
	
	

}
