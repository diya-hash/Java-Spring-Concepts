//Constructor Injection
class Car{
    Engine engine;

    @Autowired
    Car(Engine engine){
        this.engine = engine;
    }
}
//Setter Injection
class Car{
    Engine engine;

    @Autowired
    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
//Field Injection
class Car{
    @Autowired
    Engine engine;
}