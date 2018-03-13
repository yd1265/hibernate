package com.jdbc;

import java.util.List;

public interface StudentDao {
	
	
public void addStudent(Student s);


public void deleteStudent(int id);

public void update(int id);


public Student getStudent(int id);


public List<Student> getStudents();
}
