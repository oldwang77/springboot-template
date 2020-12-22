package com.transwrap.demo.service;

import com.transwrap.demo.entity.Student;

import java.util.List;

public interface StudentService {
    Student queryById(Integer id);

    List<Student> queryAllByLimit(int offset, int limit);
}
