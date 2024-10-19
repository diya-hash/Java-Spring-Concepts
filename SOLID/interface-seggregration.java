//example not using the Interface seggregration
interface IAreaCalculator(){
    double calculateArea();
    double calculateVolume();
    double calculateDiameter();
    //...
    //...
}

//example using Interface Seggregration
interface IAreaCalculator(){
    double calculateArea();
}
interface IVolumeCalculator(){
    double calculateVolume();
}
interface IDiameterCalculator(){
    double calculateDiameter();
}