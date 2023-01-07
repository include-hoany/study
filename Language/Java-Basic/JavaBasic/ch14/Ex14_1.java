package ch14;
@FunctionalInterface
interface MyFunction {
  void run();
}

@FunctionalInterface
interface MyFunction3 {
  void myMethod();
}

public class Ex14_1 {
  static void execute(MyFunction f) {
    f.run();
  }

  static MyFunction getMyFunction() {
    MyFunction f = () -> System.out.println("f3.run()");
    return f;
  }

  static void aMethod (MyFunction3 f) {
    f.myMethod();
  }

  public static void main(String[] args) {
    MyFunction f1 = () -> System.out.println("f1.run()");
    MyFunction f2 = new MyFunction() {
      @Override
      public void run() {
        System.out.println("f2.run()");
      }
    };
    f1.run();
    f2.run();

    MyFunction3 f = () -> System.out.println("myMethod()");
    aMethod(f);

  }

}
