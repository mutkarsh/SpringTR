package com.globant.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
//        FileSystemXmlApplicationContext fs = new FileSystemXmlApplicationContext("C:\\Users\\utkarsh.mandade\\git\\repository\\springone\\resources\\context.xml");
//        String names[] = context.getBeanDefinitionNames();
        		
        		
        GreetingService greetservice = (GreetingService) context.getBean("greetingService");
        System.out.println(greetservice.greet());
        System.out.println("name : "+greetservice.getName());
        
        HelloService helloservice = (HelloService) context.getBean("helloService");
        System.out.println(helloservice.getMsg());
        
        FooService fs = (FooService) context.getBean("fooService");
        fs.print();
        
        Student ss = (Student) context.getBean("student");
        System.out.println(ss+":"+ss.getName());
        

        Student ss1 = (Student) context.getBean("student");
        System.out.println(ss1+":"+ss.getName());
        context.registerShutdownHook();
        context.close();
    }
}
