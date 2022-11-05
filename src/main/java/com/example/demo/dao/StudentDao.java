package com.example.demo.dao;

import com.example.demo.Student;

public interface StudentDao {

    Student getById(Integer studentId);

    Student deleteById(Integer studentId);

    Integer insert(Student student);

    void update(Student student);
}
