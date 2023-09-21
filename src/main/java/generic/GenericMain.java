class GenericMain {

 public static void main(String[] args) {
    ClassName<String> stringClass = new ClassName<String>();
    ClassName<Integer> integerClass = new ClassName<Integer>();


    stringClass.set("Hello");
    integerClass.set(123);

    System.out.println("sC : " + stringClass.get());
    // 반환된 변수의 타입출력
    System.out.println("sC : " + stringClass.get().getClass().getName());
    System.out.println("iC : " + integerClass.get());
    // 반환된 변수의 타입출력
    System.out.println("iC : " + integerClass.get().getClass().getName());

  }
}


  // 제네릭 클래스 생성
class ClassName<T> {
  private T element; // T 타입의 변수 선언

    void set(T element) {
        this.element = element; // setter
    }

    T get() {
        return element; // getter
    }
}


