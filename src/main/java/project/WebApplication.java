package project;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.File;


@SpringBootApplication
@EntityScan(basePackages = "project.dm")
public class WebApplication extends SpringBootServletInitializer {

    private static final String WEBAPP_DIR_LOCATION = "src/main/webapp";
    private static final String CONTEXT_PATH = "";
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
        File webappDir = new File(WEBAPP_DIR_LOCATION);
        Tomcat tomcat = new Tomcat();
        tomcat.addWebapp(CONTEXT_PATH, webappDir.getAbsolutePath());
    }


}
