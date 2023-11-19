package ex4;

// NOTE : 추상 클래스
/*
 * 추상 클래스는 클래스와 인터페이스의 중간에 위치한 클래스 입니다.
 * 클래스는 객체를 생성할 수 있지만 추상 클래스의 경우 객체를 생성할 수 없습니다.
 * 추상 클래스는 abstract 키워드를 사용합니다.
 */
public abstract class ex4Animal {
  String name;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  // NOTE : 추상 메소드
  /*
   * 추상클래스에선 추상 메소드를 선언할 수 있습니다.
   * 추상 메소드는 상속받는 클래스에서 정의하도록 하고 여기선 그 대략적인 형태만 정의해놓습니다.
   * 추상 메소드 사용법은 abstract 키워드를 사용합니다.
   * abstract 리턴타입 메소드명(매개변수, ....)
   */
  public abstract void sound();

}