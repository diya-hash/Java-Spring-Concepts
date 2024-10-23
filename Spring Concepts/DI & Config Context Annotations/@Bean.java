package net.codejava.bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
 
import net.codejava.bean.Foo;
 
public class Foo {
     
    public void doFooStuff() {
        System.out.println("I'm doing something useful...");
    }
}
 
@Configuration
public class AppConfig {
 
    @Bean
    public Foo myBean() {
        return new Foo();
    }  
}
 
@Service
public class FooService {
 
    @Autowired Foo foo;
     
    public void doFooService() {
        foo.doFooStuff();
    }
}
 
@SpringBootApplication
public class SpringAnnotationsApplication implements ApplicationContextAware {
 
    static ApplicationContext context;
 
    public static void main(String[] args) {
        SpringApplication.run(SpringAnnotationsApplication.class, args);
         
        Foo foo = (Foo) context.getBean("myBean");
        foo.doFooStuff();      
    }
 
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
 
}
// Reference: https://www.codejava.net/frameworks/spring/bean-annotation-examples