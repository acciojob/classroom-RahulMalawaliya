package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	
	private HashMap<String,Student> studentmap;
	
	private HashMap<String,Teacher> teachermap;
	
	private HashMap<String,List<String>> pairmap;

	public StudentRepository(HashMap<String, Student> studentmap, HashMap<String, Teacher> teachermap,
			HashMap<String, List<String>> pairmap) {
		super();
		this.studentmap = new HashMap<String,Student>();
		this.teachermap = new HashMap<String,Teacher>();
		this.pairmap = new HashMap<String,List<String>>();
		
	}
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentmap.put(student.getName(), student);
		
	}

	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teachermap.put(teacher.getName(), teacher);
		
	}

	public void addStudentTeacherPair(String student, String teacher) {
		// TODO Auto-generated method stub
		if(studentmap.containsKey(student) && teachermap.containsKey(teacher))
		{
			List<String> liststudent=new ArrayList<>();
			if(pairmap.containsKey(teacher))
			{
				liststudent=pairmap.get(teacher);
				liststudent.add(student);
				
				pairmap.put(teacher, liststudent);
			}
		}
		
	}

	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentmap.get(name);
	}

	public Teacher getTeacherByName(String name) {
		// TODO Auto-generated method stub
		return teachermap.get(name);
	}

	public List<String> getAllStudents() {
		// TODO Auto-generated method stub
		List<String> studentname=new ArrayList<>();
		for(Entry<String, Student> Entry : studentmap.entrySet())
		{
			studentname.add(Entry.getKey());
		}
		return studentname;
	}

	public List<String> getStudentsByTeacherName(String teacher) {
		// TODO Auto-generated method stub
		return pairmap.get(teacher);
	}

	public void deleteTeacherByName(String teacher) {
		// TODO Auto-generated method stub
		teachermap.remove(teacher);
		
	}

	public void deleteAllTeachers() {
		// TODO Auto-generated method stub
		teachermap.clear();
		
	}
	
	
	

}
