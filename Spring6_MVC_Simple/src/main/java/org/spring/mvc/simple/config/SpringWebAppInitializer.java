package org.spring.mvc.simple.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
/*
 This code configures a Spring MVC application using Java-based configuration, 
 registers a DispatcherServlet for handling requests, 
 sets up a context loader listener to load the application context, 
 and adds a filter for character encoding. This is a common setup for a basic Spring MVC web application.
 * */

public class SpringWebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		/*
		 * ApplicationContext that reads bean definitions from Java-based configuration classes annotated with @Configuration.
		 */
		AnnotationConfigWebApplicationContext appContext=new AnnotationConfigWebApplicationContext();
		/*
		 * The ApplicationContextConfig.class is a configuration class annotated with @Configuration that defines the configuration for the Spring application.
		 */
		appContext.register(ApplicationContextConfig.class);
		/*
		 * DispatcherServlet is the front controller in a Spring MVC application. 
		 * It receives incoming requests and dispatches them to the appropriate controllers.
		 */
		ServletRegistration.Dynamic dispatcher=servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		/*
		 * ContextLoaderListener is a listener that initializes the root context of the Spring application.
			It's responsible for loading the root application context, including the beans defined in the ApplicationContextConfig class.
		 */
		dispatcher.setInitParameter("ContextClass", appContext.getClass().getName());
		servletContext.addListener(new ContextLoaderListener(appContext));
		/*
		 * A Filter named encodingFilter is added to the servlet context. 
		 * This filter is responsible for setting the character encoding for request and response.
		 */
		FilterRegistration.Dynamic fr=servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		fr.setInitParameter("encoding", "UTF-8");
		fr.setInitParameter("forceEncoding", "true");
		fr.addMappingForUrlPatterns(null, true, "/*");
	}

}
