package com.globant.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globant.spring.dao.OrderDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        OrderService os = (OrderService) context.getBean("orderService");
        PaymentService ps = (PaymentService) context.getBean("paymentService");
        os.placeorder();
//        os.shiporder();
        OrderDAO ods = (OrderDAO) context.getBean("orderDao");
        ods.placeorder();
        
    }
}
