package org.spring.depenInj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(r);
		Student obj=(Student)fact.getBean("e");	
		
		/*
		Address add=new Address("Cochin","Kerala","India");
		Student obj=new Student(1,"Haritha",add); */
		
		obj.show();
	}
}
