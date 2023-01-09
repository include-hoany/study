void main() {
  
  // 1. 변수의 선언
  // 변수를 명시적으로 , 선언적으로 생성할 수 있다.
  // 담만 메소드내의 지역변수는 var로 생성하고
  // class의 필드는 선언형으로 설계한다.
  
  // var name = '니꼬';

  String name = '니꼬';

  // 2. 다이나믹 변수
  // 어느 데이터 타입이던 그때그때 리터럴에 따라 타입이 변경되는 변수
  // 다이나믹 타입은 정말 필요로 할때만 사용해야하며 그 외에는 사용하지 않는것이 좋다.
  // var name2;
  dynamic name2;
  name2 = 'nico';
  name2 = 12;
  name2 = true;

  // name2는 다이나믹 타입이기때문에 어떤 타입인지 확인해야 해당 타입의 메소드를 사용할 수 있다.
  if(name2 is String) {
  
  }


  // 3. null safety
  // String nico = 'nico';
  // nico = null;

  String? nico = 'nico';
  nico = null;

  // nico가 null이 아니라면 isNotEmpty를 실행한다. 
  nico?.isNotEmpty;

  // 4. final 상수
  final NAME = 'nico';

  // 상숙기 때문에 더이상 값을 변경할 수 없다.
  // NAME = '1';

  // 5. late variable
  // late는 초기 데이터 없이 변수를 선언할 수 있는 문법이다.
  late final String nameLate;
  // do something, go to api
  nameLate = 'nico';

  // 6. const 상수 javascript의 const와는 다른 성격이다.
  // compile-time constant
  // const는 컴파일 할 때 알고 있는 값에 사용한다.
  const nameConst = 'nico';
  
}