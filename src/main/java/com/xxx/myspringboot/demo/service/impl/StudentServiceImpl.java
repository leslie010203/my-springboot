package com.xxx.myspringboot.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xxx.myspringboot.demo.mapper.StudentMapper;
import com.xxx.myspringboot.demo.model.Student;
import com.xxx.myspringboot.demo.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentServiceImpl
 * @Author hello
 * @Date 2018/12/24 11:13
 **/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {
}
