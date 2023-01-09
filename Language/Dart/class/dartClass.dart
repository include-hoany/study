
// 1. class 클래스의 멤버변수는 추론형 var변수를 사용하지 않고 타입을 명시하여 사용해야한다.
// class Player {
//  final String name = 'nico';
//  int xp = 1500;
//
//
//  void sayHello() {
//    print("Hi my name is $name");
//  }
//}

// 2. Constructors
// class Player {
//  final String name;
//  int xp;

//  Player(this.name, this.xp);


//  void sayHello() {
//    print("Hi my name is $name");
//  }

// }

// 3. Named Constructor Parameters
// class Player {
//  final String name;
//  int xp;
//  String team;
//  int age;

//  Player({required this.name, required this.xp, required this.team, required this.age});


//  void sayHello() {
//    print("Hi my name is $name");
//  }

// }

// 4. Named constructor
// class Player {
//  final String name;
//  int xp;
//  String team;
//  int age;

//  Player({required this.name, required this.xp, required this.team, required this.age});

//  Player.createBluePalayer({required String name, required int age}) : 
//  this.age = age,
//  this.name = name,
//  this.team = 'blue',
//  this.xp = 0;

//  Player.createRedPalayer({required String name, required int age}) : 
//  this.age = age,
//  this.name = name,
//  this.team = 'red',
//  this.xp = 0;


//  void sayHello() {
//    print("Hi my name is $name");
//  }

// }

// 5. fromJson
class Player {
 String name;
 int xp;
 String team;
 int age;

 Player({required this.name, required this.xp, required this.team, required this.age});

 Player.createBluePalayer({required String name, required int age}) : 
 this.age = age,
 this.name = name,
 this.team = 'blue',
 this.xp = 0;

 Player.createRedPalayer({required String name, required int age}) : 
 this.age = age,
 this.name = name,
 this.team = 'red',
 this.xp = 0;

 Player.fromJson(Map<String, dynamic> playerJson) :
 this.name = playerJson['name'],
 this.xp = playerJson['xp'],
 this.team = playerJson['name'],
 this.age = playerJson['age'];


 void sayHello() {
   print("Hi my name is $name");
 }

}


void main() {
  var player = Player.createBluePalayer(name: "nico", age: 19);
  var player2 = Player.createRedPalayer(name: "nico", age: 21);

  var apiData = [
    {
      "name": "nico",
      "team": "rde",
      "xp": 0,
      "age": 20
    },
    {
      "name": "lynn",
      "team": "rde",
      "xp": 0,
      "age": 20
    },
    {
      "name": "dal",
      "team": "rde",
      "xp": 0,
      "age": 20
    }
  ];

  apiData.forEach((playerJson) {
    var player = Player.fromJson(playerJson);
    player.sayHello();
   });

   // 6. Cascade Notation
   var nico = Player(name: 'nico', xp: 1200, team: 'red', age: 20)
   ..name = 'las'
   ..xp = 1200000
   ..team = 'blue';

}