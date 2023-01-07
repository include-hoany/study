package ch07;

class Student {
  String name;
  int studentNumber;

  Student(String name, int studentnumber) {
    this.name = name;
    this.studentNumber = studentnumber;
  }
}

class Car {
  String name;
  int carNumber;

  Car(String name, int carNumber) {
    this.name = name;
    this.carNumber = carNumber;
  }
}

public class Ex7_7 {
  public static void main(String[] args) {

    try {
      new Thread (()-> {
        for(int i = 0; i < 10; i++) {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          System.out.println(i);
        }
      }).start();

    } catch(Exception e) {

    }

    //    LinkedList<Object> list = new LinkedList<Object>();
    //    Student s1 = new Student("안녕" , 12);
    //    Student s2 = new Student("하세요", 13);
    //
    //    Car c1 = new Car("볼보", 12);
    //    Car c2 = new Car("폭스바겐", 20);


    //    list.add(s1);
    //    list.add(s2);
    //    list.add(c1);
    //    list.add(c2);


    //    Object[] tempArr = list.toArray();
    //    for(Object item : tempArr) {
    //      if(item instanceof Student) {
    //        Student studentTemp = (Student)item;
    //        System.out.printf("Student %s, %d%n", studentTemp.name, studentTemp.studentNumber);
    //      } else if(item instanceof Car) {
    //        Car carTemp = (Car)item;
    //        System.out.printf("Car %s, %d%n", carTemp.name, carTemp.carNumber);
    //      }
    //    }

    //    Object[] tempCarArr = list.stream().filter(s -> s instanceof Car).toArray();
    //    for(Object item : tempCarArr) {
    //      Car tempCar = (Car)item;
    //      System.out.println(tempCar.name);
    //      tempCar.name = "변경됨?";
    //    }
    //
    //    tempCarArr = list.stream().filter(s -> s instanceof Car).toArray();
    //    for(Object item : tempCarArr) {
    //      Car tempCar = (Car)item;
    //      System.out.println(tempCar.name);
    //    }




    //    Person.helloWorld();
    //    Person.helloWorld();
    //    Person.helloWorld();

    //    Car car = null;
    //    FireEngine fe = new FireEngine();
    //    FireEngine fe2 = null;
    //
    //    fe.water();
    //    car = fe;
    //    //    car.water();
    //    fe2 = (FireEngine)car;
    //    fe2.water();
    //
    //
    //    System.out.println(fe instanceof Car);
    //    System.out.println(fe instanceof Object);
    //    System.out.println(fe instanceof FireEngine);
  }

  //}
  //class Person{
  //  String name;
  //  static {
  //    System.out.println("생성되었따!!");
  //  }
  //
  //  static void helloWorld() {
  //    System.out.println("악 호출!!");
  //  }
  //}
  //
  //class Car {
  //  String color;
  //  int door;
  //
  //  void drive() {
  //    System.out.println("drive, Brrrr~");
  //  }
  //
  //  void stop() {
  //    System.out.println("Stop!!");
  //  }
  //}
  //
  //
  //class FireEngine extends Car {
  //  void water() {
  //    System.out.println("water!!!");
  //  }
}
