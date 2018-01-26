package com.ssm.test;


import com.ssm.controller.StudentController;
import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
import com.ssm.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dllo on 18/1/26.
 */
public class MainTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath*:spring-*.xml");

    }

    @Test
    public void testMapper(){
        /*获得mybatis的Student表的代理对象*/
//        StudentMapper studentMapper = context.getBean(StudentMapper.class);
//
//        // 调用接口中的查询所有
////        List<Student> students =studentMapper.selectAll();
//
//        int count =studentMapper.getTotalRecord();
//        System.out.println(count);
//        PageBean<Student> pageBean =new PageBean<Student>(1,3,count);
//        System.out.println(studentMapper.selectPage(pageBean));
    }

    @Test
    public void testPage(){

//        StudentMapper studentMapper = context.getBean(StudentMapper.class);
//
////        int total = studentMapper.getTotalRecord();
//        PageBean<Student> pageBean = new PageBean<Student>(1,3,total);
//        Student student = new Student();
//        student.setSname("1");
//        pageBean.setParameter(student);
//        List<Student> students = studentMapper.selectPage(pageBean);
//        System.out.println(students);

    }


    @Test
    public void testService(){
        StudentService studentService=context.getBean(StudentService.class);
        studentService.selectAll();
    }

    @Test
    public void testController(){
        StudentController studentController = context.getBean(StudentController.class);

        System.out.println(studentController.searchStudent());
    }
    public void testParamter(){
        StudentMapper studentMapper = context.getBean(StudentMapper.class);
        int startIndex = 1;
        int pageSize = 3;
    }



}
