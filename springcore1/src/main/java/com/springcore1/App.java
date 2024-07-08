package com.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student std1 = (Student) context.getBean("student1");
        Student std2 = (Student) context.getBean("student2");
        System.out.println(std1);
        String secStud = std2.getStudentName();
        System.out.println(secStud);
    }
}
