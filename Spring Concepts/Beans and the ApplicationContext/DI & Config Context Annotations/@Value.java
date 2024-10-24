//Constructor Injection
Engine(@Value("8") int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
//Setter Injection - one way
@Autowired
void setCylinderCount(@Value("8") int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
//Setter Injection - another way
@Value("8")
void setCylinderCount(int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
//Field Injection
@Value("8")
int cylinderCount;
//Field Injection - another way
//assume this is the .properties file which has the following:
engine.fuelType=petrol
//We can inject the value of engine.fuelType with the following:
@Value("${engine.fuelType}")
String fuelType;