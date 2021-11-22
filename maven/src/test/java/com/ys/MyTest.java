package com.ys;

import com.ys.impl.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        Service sc = new ServiceImpl();
        sc.doSome();
    }
    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Service sc = (Service)ac.getBean("service");
        sc.doSome();
    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int num = ac.getBeanDefinitionCount();
        System.out.println("spring容器中含有对象数:"+num);
        String names[] = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date)ac.getBean("mydate");
        System.out.println("现在的时间是："+my);
    }

}
