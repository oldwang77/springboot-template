package com.transwrap.demo.service.Impl;

import com.transwrap.demo.dao.StudentDao;
import com.transwrap.demo.entity.Student;
import com.transwrap.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryById(Integer id) {
        return studentDao.queryById(id);
    }

    @Override
    public List<Student> queryAllByLimit(int offset, int limit) {
        return studentDao.queryAllByLimit(offset,limit);
    }
}
