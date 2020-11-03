package com.atguigu.edu.controller;


import com.atguigu.edu.entity.Teacher;
import com.atguigu.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-11-02
 */
@RestController
@RequestMapping(value = "/eduservice/teacher",produces = "application/json; charset=utf-8")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //查询讲师表所有数据
    @GetMapping("findAll")
    public List<Teacher> findAllTeacher(){
        return teacherService.list(null);
    }

    //逻辑删除
    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String id){
        return teacherService.removeById(id);
    }


}

