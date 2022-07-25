package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;
import com.aop.services.PaymentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/aop/config.xml");
        
        PaymentService paymentObj=context.getBean("payment",PaymentService.class);
        paymentObj.makePayment();
    }
}
