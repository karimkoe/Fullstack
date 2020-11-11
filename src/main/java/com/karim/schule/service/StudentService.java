package com.karim.schule.service;

import com.karim.schule.Repository.StudentRepository;
import com.karim.schule.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(@Qualifier("StudentRepository") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        }
    }

    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.getOne(id);
    }


    public void updateStudentById(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            studentRepository.save(student);
        }

    }

}
