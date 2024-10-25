Spring Bean Annotations

There are several ways to configure beans in a Spring container:

1. Using XML Configuration
2. Declare beans using the @Bean annotation in a configuration class
3. Mark the class with one of the annotations from the org.springframework.stereotype package, and leave the rest to component scanning.

Following are the commonly used Spring Annotations:

1. @Component: It's a class level annotation. During the component scan, Spring Framework automatically detects classes annotated with @Component.

2. @Repository: DAO or Repository classes usually represent the database access layer in an application, and should be annotated with @Repository. Copy
   One advantage of using this annotation is that it has automatic persistence exception translation enabled. When using a persistence framework, such as Hibernate, native exceptions thrown within classes annotated with @Repository will be automatically translated into subclasses of Spring’s DataAccessExeption. To enable exception translation, we need to declare our own PersistenceExceptionTranslationPostProcessor bean:

3. @Service: The business logic of an application usually resides within the service layer, so we’ll use the @Service annotation to indicate that a class belongs to that layer.

4. @Controller: It is a class level annotation, which tells the Spring Framework that this class serves as a controller in Spring MVC.

5. @Configuration: Configuration classes can contain bean definition methods annotated with @Bean.

Reference:
[1] https://www.baeldung.com/spring-bean-annotations
