@DependsOn("engine")
class Car implements Vehicle {}

//Alternatively:
@Bean
@DependsOn("fuel")
Engine engine() {
    return new Engine();
}