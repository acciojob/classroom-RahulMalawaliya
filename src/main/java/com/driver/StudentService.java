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
		res.addingStudentToDB(student);
	}

	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		res.addingTeacherToDB(teacher);
		
	}

	public void addStudentTeacherPair(String student, String teacher) {
		// TODO Auto-generated method stub
		res.addingStudentTeacherPairToDB(student,teacher);
		
	}

	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		
		return res.gettingStudentByNameFromDB(name);
	}

	public Teacher getTeacherByName(String name) {
		// TODO Auto-generated method stub
		return res.gettingTeacherByNameFromDB(name);
	}

	public List<String> getAllStudents() {
		// TODO Auto-generated method stub
		return res.gettingAllStudentsFromDB();
	}

	public List<String> getStudentsByTeacherName(String teacher) {
		// TODO Auto-generated method stub
		return res.gettingStudentsByTeacherNameFromDB(teacher);
	}

	public void deleteTeacherByName(String teacher) {
		// TODO Auto-generated method stub
		res.deletingTeacherByNameFromDB(teacher);
		
	}

	public void deleteAllTeachers() {
		// TODO Auto-generated method stub
		res.deletingAllTeachersFromDB();
		
	}
	
	

}
