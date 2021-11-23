package org.example;

import org.example.bao01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
@Test
    public void teat01(){
    String config = "applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    Student stu = (Student)ac.getBean("myStudent");
    System.out.println("student的对象"+stu);
}
}
