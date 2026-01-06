package com.rizvi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");
//         Network network = (Network) context.getBean("network",Network.class);
//        System.out.println(network.toString());
           Phone phone = context.getBean("phone",Phone.class);
           System.out.println(phone);
           System.out.println(phone.network);



       //Dev obj = context.getBean(Dev.class);
          //obj.setName("Rizvi");

       //obj.setAge(30);
       //   obj.build();
//        System.out.println(obj.getName());
//        System.out.println(obj.getAge());
//         System.out.println(obj);
    }
}
