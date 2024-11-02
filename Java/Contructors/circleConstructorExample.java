public class circleConstructorExample {
  int radius;

  public circleConstructorExample(int r) {
    radius = r;
  }

  public static void main(String[] args) {
    circleConstructorExample myObj = new circleConstructorExample(5);
    System.out.println(myObj);
  }
}
// Outputs 5