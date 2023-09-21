# basics

### static, final, static final의 차이

static	객체마다 가질 필요가 없는 공용으로 사용하는 필드 혹은 인스턴스 필드를 포함하지 않는 메소드
final	한 번 값이 정해지고 나면 값을 바꿀 수 없는 필드
static final	모든 영역에서 고정된 값으로 사용하는 상수


#### static method

유틸리티성 메소드를 작성할 때 많이 사용
객체생성 없이 클래스를 통해 메서드 직접 호출 가능

### Interface

기본적으로 서로 그룹화해서 쓰이는 메소드를 모아놓은 추상클래스이다.
추상클래스이기 때문에 사용하려면 구현해주어야 한다.


# Concept 공부

### callback

비동기 함수를 호출할 때는 결과값을 리턴 받으려고 하지말고, 결과값을 통해 처리할 로직을 콜백 함수로 넘기는 스타일로 코딩을 해줘야 예상된 결과를 얻을 수 있다.

### lambda

# Project관련

## JPAshop

다음 url로 접근
jdbc:h2:tcp://localhost/~/jpashop  

tmp_edcb001_m01

### Bean

**Bean 정의 in XML(spring configuration file)**






In Spring, a "bean" is simply an object that is managed by the Spring IoC (Inversion of Control) container. It's an instance of a class that is instantiated, assembled, and otherwise managed by Spring.

A bean is typically defined in a Spring configuration file (such as an XML file or a Java configuration class) and is created by the Spring container when the application starts up. The Spring container is responsible for managing the lifecycle of the bean, including creating, configuring, and destroying it.

A bean is identified by a unique name (also known as an ID or a bean identifier) within the container. The name is used to refer to the bean when it's needed by other parts of the application.

```xml
<bean id="myBean" class="com.example.MyBean">
   <property name="myProperty" value="myValue"/>
</bean>
```

In this example, the bean has the ID "myBean" and is of class "com.example.MyBean". It also has a property named "myProperty" that is set to the value "myValue".

```java
@Configuration
public class MyConfig {

	@Bean
	public Mybean myBean() {
		Mybean bean = new myBean();
		bean.setMyProperty("myValue");
		return bean;
	}
}

```

In this example, the @Bean annotation is used to indicate that the method should return a bean instance. The MyBean object is created and its myProperty is set to "myValue". When the Spring container starts up, it will create the bean and make it available for use elsewhere in the application.

Beans can be used in various parts of a Spring application, such as controllers, services, and repositories. By using beans, you can take advantage of Spring's powerful features, such as dependency injection, aspect-oriented programming, and declarative transaction management.

### 의존성 주입

의존성 주입이란 객체 생성자를 외부에서 주입하는 방식이다.

의존성 주입은 인터페이스 변수를 통해 멤버변수를 선언하고 사용할 떼 외부에서 인터페이스를 구현한 객체를 주입받아 사용



### Dependency Injection



### @Autowired


### Service

## Encapsulate and Manage Data

1. DAO
2. VO
3. Repository