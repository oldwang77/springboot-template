package com.transwrap.demo.controller;

import com.transwrap.demo.entity.Student;
import com.transwrap.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class HelloController {

    @Autowired
    private StudentService studentService;

    // 测试代码：http://localhost:8080/student/selectOne?id=1

    @GetMapping("selectOne")
    public Student selectOne(Integer id) {
        System.out.println(studentService.queryById(id));
        return studentService.queryById(id);
    }
}
