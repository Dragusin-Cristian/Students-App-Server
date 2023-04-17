package com.Cristi.students.Service;

import com.Cristi.students.model.Student;
import com.Cristi.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    // Wire the StudentRepository into out class:
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student editStudent(int studentId, Student student) {
        student.setId(studentId);
        return studentRepository.save(student);
    }
}
