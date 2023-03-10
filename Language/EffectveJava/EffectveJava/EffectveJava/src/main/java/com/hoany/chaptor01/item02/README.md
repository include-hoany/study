### 아이템 2. 생성자에 매개변수가 많다면 빌더를 고려하라

---

1. p15, 자바빈즈, 게터, 세터
2. p17, 객체 얼리기 (freezing) <- 자바에는 없는 개념이지만 javascript에는 해당 개념이 존재함
3. p17, 빌더 패턴
4. p19, IllegalArgumentException
5. p20, 재귀적인 타입 한정을 이용하는 제네릭 타입
6. p21, 가변인수 (varargs) 매개변수를 여러개 사용할 수 있다.


---
#### 완변공략 6. 자바빈(JavaBean)이란?
>java.beans패키지 안에 있는 모든것
> >그 중에서도 자바빈이 지켜야 할 규약
> >>1. 아규먼트 없는 기본 생성자
> >>2. getter와 setter 메소드 이름 규약
> >>3. Serializable인터페이스 구현
> >>
> >하지만 실제로 오늘날 자바빈 스팩 중에서도 getter와 setter가 주로 쓰는 이유는?
> >>1. JPA나 스프링과 같은 여러 프레임워크에서 리플렉션을 통해 특정 객체의 값을 조회하거나 설정하기 때문입니다.
> >>

#### 완변공략 7. 객체 얼리기(freezing)
#### 임의로 객체를 불변 객체로 만들어주는 기능.
>Objectfreeze()에 전달한 객체는 그뒤로 변경될 수 없다.
>>새 프로퍼티를 추가하지 못함
> >1. 기존 프로퍼티를 제거하지 못함
> >2. 기존 프로퍼티 값을 변경하지 못함
> >3. 기존 프로퍼티 값을 변경하지 못함
> >4. 프로토타입을 변경하지 못함
> 
>>strict 모드에서만 동작함
>>1. 비슷한 류의 함수로는 Object.seal(), Object.preverntExtensions()가 있다.

#### 완변 공략 8. 빌더 패턴
##### 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법.
>복잡한 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.
> 
#### 완변 공략 9. IllegalArgumentException
##### 잘못된 인자를 넘겨 받았을 때 사용할 수 있는 기본 런타임 예외
> 자바에서 정의한 RunTimeException을 사용하고 없을경우에만 사용자정의 Exception을 사용하라

#### 완변 공략 10. 가변인수
##### 여러 인자를 받을 수 있는 가변적인 argument (Var+args)
>1. 가변인수는 메소드에 오직 하나만 선언할 수 있다.
>2. 가변인수는 메소드의 가장 마지막 매개변수가 되어야 한다.