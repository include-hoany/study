
// 6. Enums
enum Team { red, blue }
enum XPLevel { beginner, medium, pro }

class Player {
 String name;
 XPLevel xp;
 Team team;
 int age;

 Player({required this.name, required this.xp, required this.team, required this.age});

 Player.createBluePalayer({required String name, required int age}) : 
 this.age = age,
 this.name = name,
 this.team = Team.blue,
 this.xp = XPLevel.medium;

 Player.createRedPalayer({required String name, required int age}) : 
 this.age = age,
 this.name = name,
 this.team = Team.red,
 this.xp = XPLevel.pro;

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
   var nico = Player(name: 'nico', xp: XPLevel.beginner, team: Team.red, age: 20)
   ..name = 'las'
   ..xp = XPLevel.pro
   ..team = Team.blue;
  
}