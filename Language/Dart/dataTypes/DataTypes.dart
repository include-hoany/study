void main() {
  // 1. dart의 자료형은 모두 class 객체이다.
  String name = "nico";
  bool alive  = true;
  int age = 12;
  double money = 69.99;
  num x = 12;
  x = 1.1;


  // 2. list
  var giveMeFive = true;
  var numbers = [1, 2, 3, 4];
  List<int> numbersTwo = [1, 2, 3, 4, if(giveMeFive) 5];
  numbers.add(1);
  print(numbersTwo);

  // 3. String interpolation
  var nameInter = 'nico';
  var ageInter = 10;
  var greeting = "Hello everyone, my name is $nameInter and I'm ${ageInter + 2}, nice meet you";
  print(greeting);

  // 4. collection for
  var oldFriends = ['nico', 'lynn'];
  var newFreiends = [
    'lewis',
    'ralph',
    'darren',
    for(var friend in oldFriends) "❤️ $friend",
  ];

  print(newFreiends);

  // 5. Map
  var player = {
    'name' : 'nico',
    'xp' : 19.99,
    'superpower' : false
  };

  // 6. Set
  Set<int> numbersSet = {1, 2, 3, 4};
  numbersSet.add(1);
  print(numbersSet);


}