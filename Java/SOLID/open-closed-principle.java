//the first example is not following the open-closed principle 
public class diameterOfShape(){
    public double diameter(Shape shape){
    double diameterOfShape;
    if(shape instanceof Square){
        // calculate the diameter of Square
    } else if(shape instanceof Circle){
        // calculate the diameter of circle
    }
    return diameterOfShape;
    }
}

//example using the open-closed principle
interface IDiameterCalculator(){
  double diameter();
}

class Square implements IDiamterCalculator{
  @Override
  public double diameter(){
    System.out.println("Calculating diameter for Square");
    //return diameter of square
   }
}

class Circle implements IDiameterCalculator{
  @Override
  public double diameter(){
    System.out.println("Calculating diameter for Circle");
    //return diameter of circle
   }
}
