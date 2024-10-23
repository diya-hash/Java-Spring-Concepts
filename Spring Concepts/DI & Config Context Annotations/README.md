Dependency Injection Annotations
What are Dependency Injection(DI) annotations:

- To leverage the capabilities of Spring DI engine using the annotations in the org.springframework.beans.factory.annotation and org.springframework.context.annotation packages.

Examples:

1. @Autowired is used to mark dependencies which Spring will resolve and inject. Can be used with a constructor, setter, or field injection.

2. @Bean marks a factory method which instantiates a Spring Bean (object) that will be managed by the Spring Context. This will enable classses to call the @Bean annotated method using the AppplicationContext from the Spring Container. Note, that all methods annotated with @Bean must be in @Configuration classes.

3. @Value is used for injecting property values into beans. It’s compatible with constructor, setter, and field injection.

4. @DependsOn is required when the dependencies are implicit. We can use @DependsOn on the dependent class specifying the names of the dependency beans.

5. @Lazy is used to initialize our bean lazily. By default, Spring creates all singleton beans eagerly at the startup/bootstrapping of the application context.However, there are cases when we need to create a bean when we request it, not at application startup:

1) a @Bean annotated bean factory method, to delay the method call (hence the bean creation)

2) a @Configuration class and all contained @Bean methods will be affected
3) a @Component class, which is not a @Configuration class, this bean will be initialized lazily

4) an @Autowired constructor, setter, or field, to load the dependency itself lazily (via proxy)
   This annotation has an argument named value with the default value of true. It is useful to override the default behavior.

6. @Primary is used to mark the most frequently used bean for it to be chosen on the unqualified injection points. This is required when multiple beans of the same type are defined.

Context Configuration Annotations

1. @Profile - If we want Spring to use a @Component class or a @Bean method only when a specific profile is active, we can mark it with @Profile. We can configure the name of the profile with the value argument of the annotation.

2. @Import - We can use specific @Configuration classes without component scanning with this annotation. We can provide those classes with @Import‘s value argument.

Resources:
[1] https://www.baeldung.com/spring-core-annotations
