// example not using Liskov principle
abstract class Bird{
   abstract void fly();
}

class Eagle extends Bird {
   @Override
   public void fly() { /* some implementation*/ }
}

class Ostrich extends Bird {
   @Override
   public void fly() { /* dummy implementation*/ }
}

//example using Lickov substitution principle
abstract class FlyingBird{
   abstract void fly();
}

abstract class NonFlyingBird{
   abstract void doSomething();
}

class Eagle extends FlyingBird {
   @Override
   public void fly() { /* some implementation*/ }

class Ostrich extends NonFlyingBird {
   @Override
   public void doSomething() { /* some implementation*/ }
}