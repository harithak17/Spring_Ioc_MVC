package org.spring.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {

	public static void main(String[] args) {
		
        /* Load the Spring XML configuration file. 
         * Resource an interface. This part creates a new instance of the ClassPathResource class,
         *  specifying the resource location as "ApplicationContext.xml". 
         *  The ClassPathResource
         *   is a Spring class that allows you to load resources from the classpath.*/
		
		Resource r=new ClassPathResource("ApplicationContext.xml");
		
		/* A BeanFactory is a central interface in Spring for configuring and managing beans.
		 * (factory)It represents a container that holds and manages bean instances.
		 * This part creates a new instance of the XmlBeanFactory class, 
		 * passing the previously created ClassPathResource (r) as an argument. 
		 * The XmlBeanFactory is a concrete implementation of the BeanFactory interface that reads 
		 * bean definitions from an XML file.*/
		BeanFactory factory=new XmlBeanFactory(r);
		
		/*This line declares a variable named empdetail of type Employee.
		 * (Employee) factory.getBean("emp"): This part retrieves a bean named "emp" from the BeanFactory
		 * The getBean method is used to get an instance of a bean by its name. 
		 * The result is cast to the Employee type.*/
		Employee empdetail=(Employee)factory.getBean("emp");	
		
		empdetail.display();
		
		
		
		// Create an ApplicationContext by loading the XML configuration file
     //   ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Retrieve the "emp" bean from the ApplicationContext
     //   Employee empDetail = (Employee) context.getBean("emp");

        // Call the display method on the Employee object
      //  empDetail.display();

	}

}
