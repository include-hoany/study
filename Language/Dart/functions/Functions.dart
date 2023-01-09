
// 1. function positional parameter
// String sayHello(String name) {
//   // call api
//   // ferformmence
//   return "Hello $name nice to meet you";
// }

// String sayHello({String name, int age, String country}) {
//   // call api
//   // ferformmence
//   return "Hello $name, you are $age and you come from $country";
// }

num plus(num a, num b) => a + b;

// 2. Named Parameters
// String sayHello({required String name, required int age, required String country}) {
//   // call api
//   // ferformmence
//   return "Hello $name, you are $age and you come from $country";
// }

// 3. Optional Positional Parameters
String sayHello(String name, int age, [String? country = 'cuba']) {
  // call api
  // ferformmence
  return "Hello $name, you are $age and you come from $country";
}

// 4. QQ Operator
String capitalizeName(String? name) => name?.toUpperCase() ?? 'ANON';


// 5. Typedef 자료형을 alias로 설정할 수 있다.
typedef ListOfInts = List<int>;

ListOfInts reverseListOfNumbers(ListOfInts list) {
  var reversed = list.reversed;
  return reversed.toList();
} 

typedef UserInfo = Map<String, String>;

String sayHi(UserInfo userInfo) {
  return "Hi ${userInfo['name']}";
}

void main() {
  print(sayHello('Hwan yeong', 31));
  print(plus(1, 10));
  print(capitalizeName('nico'));
  print(capitalizeName(null));

  print(reverseListOfNumbers([1, 2, 3]));
  print(sayHi({"name": 'nico'}));

  String? nullAbleName;
  // nullAbleName이 만약에 null이라면 해당값을 셋팅하라는 뜻이다.
  nullAbleName ??= 'nico';
}