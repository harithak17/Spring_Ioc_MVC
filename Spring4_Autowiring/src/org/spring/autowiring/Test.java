package org.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");  
	    
//	    A a=context.getBean("a",A.class); 
//	    System.out.println("-----byName-------");
//	    a.displayb();
//	    a.displayc();
	    
	    A a1=context.getBean("a1",A.class);  
	    System.out.println("-------byType-------");
	    a1.displayb(); 
//	    a.displayc();
	    
	    A a2=context.getBean("a2",A.class);  
	    System.out.println("-------byConstructor-------");
	    a2.displayb(); 
//	    a.displayc();
	}  
}
