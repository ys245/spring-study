package org.example;

import org.example.bao04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest04 {
@Test
    public void teat01(){
    String config = "applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    Student stu = (Student)ac.getBean("Student04");
    System.out.println("student的对象"+stu);
}
}
