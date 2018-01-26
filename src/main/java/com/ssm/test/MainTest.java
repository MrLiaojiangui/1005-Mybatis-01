package com.ssm.test;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.page.PageBean;
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

//    @Test
//    public void testMapper(){
//        /*获取mybatis的Student表的代理对象*/
//        StudentMapper studentMapper = context.getBean(StudentMapper.class);
//        Student student = new Student();
//
//        PageBean<Student> pg = new PageBean<>(1,3,3);
//        pg.setParameter(student);
//
////        调用接口中的查询所有
//        List<Student> students = studentMapper.selectAll();
//        System.out.println(students);
//
//
//        int count = studentMapper.getTotalRecord();
//        System.out.println(count);
//
//        PageBean<Student> pageBean = new PageBean<>(1,3,count);
//        studentMapper.pageSelect(pageBean);
//
//
//
//    }

//    @Test
//    public void testPageSelect(){
//        StudentMapper studentMapper = context.getBean(StudentMapper.class);
//        int total = studentMapper.getTotalRecord();
//
//        PageBean<Student> pageBean = new PageBean<>(1,3,total);
//        Student param = new Student();
//        param.setSname("s");
//        pageBean.setParameter(param);
//
//        List<Student> students = studentMapper.pageSelect(pageBean);
//        System.out.println(students);
//    }
}
