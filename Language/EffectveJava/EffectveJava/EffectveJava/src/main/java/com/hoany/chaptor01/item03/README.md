### 아이템 3. 생성자나 열거 타입으로 싱글턴임을 보증하라

---
>완변공략
> >1. 리플렉션 API로 private 생성자 호출하기
> >2. 메서드 참조를 공급자로 사용할 수 있다.
> >3. Supplier<T>, 함수형 인터페이스
> >4. 직렬화, 역직렬화, Serializable, transient
---
>첫번째 방법: private 생성자 + public static final 필드
> >장점
> >>간결하고 실글텀임을 API에 들어낼 수 있다.
> 
> >단점
> >>1. 싱글턴을 사용하는 클라이언트 테스트하기 어려워진다.
> >>2. 리플렉션으로 private 생성자를 호출할 수 있다.
> >>3. 역직렬화 할 때 새로운 인스턴스가 생길 수 있다.
---
>두번째 방법: private 생성자 + 정적팩터리 메소드
> >장점
> >>1. API를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다.
> >>2. 정적 팩터리를 제네릭 싱글턴 팩터리로 만들 수 있다.
> >>3. 정적 팩터리의 메서드 참조를 공급자(Supplier)로 사용할 수 잇다.
---
>세번째 방법: 생성자나 열거 타입으로 싱글턴임을 보증하라.
> > 열거타입
> >>1. 가장 간결한 방법이며 직렬화와 리플렉션에도 안전하다.
> >>2. 대부분의 상황에서는 원소가 하나뿐인 열거 타입이 싱글턴을 만드는 가장 좋은 방법이다.
---
#### 완변공략 11. 메소드 참조 
>메소드 하나만 호출하는 람다 표현식을 줄여쓰는 방법
> >1. 스타틱 메소드 레퍼런스
> >2. 인스턴스 메소드 레퍼런스
> >3. 임의 객체의 신스턴스 메소드 레퍼런스
> >4. 생성자 레퍼런스
---
#### 완변 공략 12. 함수형 인터페이스
>자바가 제공하는 기본 함수형 인터페이스
> >1.함수형 인터페이스는 람다 표현식과 메소드 참조에 대한 "타켓 타입"을 제공한다.
> >2. 타겟 타입은 변수 할당, 메소드 호출, 타입 변환에 활용할 수 있다.
> >3. 자바에서 제공하는 기본 함수형 인터페이스 익혀 둘 것.(java.util.function 패키지)
> >4. 함수형 인터페이스를 만드는 방법
> >>1. Understanding java method invocation invokedynamic
> >>2. LamdaMetaFactory
---
#### 완변 공략 13. 객체 직렬화
>객체를 바이트스트림으로 상호 변환하는 기술
> >1. 바이트스트림으로 변환한 객체를 파일로 저장하거나 네트워크를 통해 다른 시스템으로 전송할 수 있다.
> >2. Serializable 인터페이스 구현
> >3. transient를 사용해서 직렬화 하지 않을 필드 선언하기
> >4. serialVersionUID는 언제 왜 사용하는가?
> >5. 심화 학습) 객체 직렬화 스팩