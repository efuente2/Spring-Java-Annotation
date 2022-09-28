package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student student = (Student) context.getBean("student");
        Phone phone = (Phone)context.getBean("phone");
        Address address = (Address)context.getBean("address");

        System.out.println("Name : " + student.getName() );
        System.out.println("Address : " + address.toString());
        System.out.println("ID : " + student.getId());
        System.out.println("Phone Numbers : " + phone.toString());

        }
    }

