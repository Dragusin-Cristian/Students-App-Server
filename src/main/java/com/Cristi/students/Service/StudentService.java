package com.Cristi.students.Service;

import com.Cristi.students.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(int studentId);
    public void deleteStudent(int studentId);
    public Student editStudent(int studentId, Student student);
}
