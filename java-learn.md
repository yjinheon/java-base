

# basics

### static, final, static final의 차이

static	객체마다 가질 필요가 없는 공용으로 사용하는 필드 혹은 인스턴스 필드를 포함하지 않는 메소드
final	한 번 값이 정해지고 나면 값을 바꿀 수 없는 필드
static final	모든 영역에서 고정된 값으로 사용하는 상수

$$

$$

#### static method

유틸리티성 메소드를 작성할 때 많이 사용

객체생성 없이 클래스를 통해 메서드 직접 호출 가능


## JPAshop

다음 url로 접근
jdbc:h2:tcp://localhost/~/jpashop  


# Concept 공부

### callback

비동기 함수를 호출할 때는 결과값을 리턴 받으려고 하지말고, 결과값을 통해 처리할 로직을 콜백 함수로 넘기는 스타일로 코딩을 해줘야 예상된 결과를 얻을 수 있다.

### lambda