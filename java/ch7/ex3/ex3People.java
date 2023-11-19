package ex3;

/*
 * protected 접근자는 같은 패키지 내에선 모두 접근 가능하지만
 * 다른 패키지일 경우 상속받은 자식 클래스에서만 접근 가능한 제어자 입니다.
 */

public class ex3People {
  String name;
  int age;
  protected String address;

  ex3People(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  protected void introduce() {
    System.out.println("Hi! My name is " + this.name);
  }

}
