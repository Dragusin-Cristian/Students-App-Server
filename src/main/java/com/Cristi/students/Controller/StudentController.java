package com.Cristi.students.Controller;

import com.Cristi.students.Service.StudentService;
import com.Cristi.students.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody Student student){
        try{
            studentService.saveStudent(student);
            return new ResponseEntity(student, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudent/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId){
        try {
            Student student = studentService.getStudent(studentId);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity deleteStudent(@PathVariable int studentId){
        try{
            studentService.deleteStudent(studentId);
            return new ResponseEntity(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/editStudent/{studentId}")
    public ResponseEntity<Student> editStudent(@PathVariable int studentId, @RequestBody Student student){
        try{
            Student newStudent = studentService.editStudent(studentId, student);
            return new ResponseEntity<Student>(newStudent, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }catch(Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
