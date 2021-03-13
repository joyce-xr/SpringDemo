package sprinDemo.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class StudentTest {

    @Test
    public void test(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
//        System.out.println(student.name);
//        System.out.println(student.age);
//        System.out.println(student.dog.name);
//        System.out.println(student.dog.age);
//        System.out.println(student.dog.color);
//        System.out.println(student.dogName);

        System.out.println("打印集合------------");
        System.out.println(Arrays.toString(student.attr));
        System.out.println(student.myList);
        System.out.println(student.mySet);
        System.out.println(student.myMap);
    }
}
