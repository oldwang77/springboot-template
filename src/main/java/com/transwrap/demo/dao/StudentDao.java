package com.transwrap.demo.dao;

import com.transwrap.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentDao {

    // 通过ID查询单条数据
    Student queryById(Integer id);

    // 查询指定行数据

    /**@Param
     * 当你有两个及其以上的注解时，你就需要用这个注解了，不然在对应的xml文件，
     * 它分辨不出来这个参数是哪一个就会报错，用这个注解的意思就是说标识这个参数的名称，
     * 以便让接受参数的一方更好的找到并利用这个值。
     */
    List<Student> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    // 查询数据库内全部的信息
    List<Student> queryAll(Student student);
}
