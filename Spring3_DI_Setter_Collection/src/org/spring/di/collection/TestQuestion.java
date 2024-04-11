package org.spring.di.collection;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;


public class TestQuestion {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Question q=(Question)bf.getBean("q");
		q.displayInfo();

	}

}
