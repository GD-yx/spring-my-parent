package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author 南八
 */
public class ApplicationContextInstantiateListener implements ServletContextListener {
   public static final String SPRING_CONTAINER_KEY = "SPRING_CONTAINER";

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String configFile = servletContext.getInitParameter("configFile");
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        servletContext.setAttribute(SPRING_CONTAINER_KEY,context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
