package org.cody.spring.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        container.addListener(new ContextLoaderListener(ctx));

        ctx.register(ApplicationContext.class);
        ctx.setServletContext(container);
        ctx.refresh();

        DispatcherServlet dispatcher = new DispatcherServlet(ctx);
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", dispatcher);

        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
