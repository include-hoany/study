
// 9. Mixins Mixin은 상속과 달리 with라는 키워드를 사용해서
// 역할은 단순히 Mixin 내부의 프로퍼티와 메소드들을 가져오는 역할만 한다.
// 부모 클래스가 되거나 하지 않는다. 해당 필드와, 메소드는 뺏어온다고 생각하면 된다.

// 단 Mixin이 되기위해서는 해당 클래스는 생성자가 없는 클래스여야 한다.

class Strong {
  final double strenghtLevel = 1500.99;
}

class QuickRunner {
  void runQuick() {
    print("ruuuuuuuun!");
  }
}

class Tall {
  final double hgeight = 1.99;
}

enum Team { blue, red }

class Player with Strong, QuickRunner, Tall {
  final Team team;

  Player({
    required this.team
  });
}


class Horse with Strong, QuickRunner {}

class Kid with QuickRunner {}


void main() {
  var player = Player(team: Team.red);
  player.runQuick();
}
