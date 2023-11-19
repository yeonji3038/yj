package ex1;

/*
 * 객체지향에서 상속은 부모 클래스를 재사용하는것을 의미합니다.
 * extends 키워드를 사용해 상속할 수 있습니다.
 * 
 * People 클래스는 Teacher의 부모 클래스입니다.
 */
public class ex1People {

  public String name;
  public int age;
  public String address;

  public ex1People(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  void introduce() {
    System.out.println("My name is " + this.name + " nice to meet you!");
  }

  /*
   * 필드에 final을 붙이면 값을 바꿀수 없는 필드가 됩니다.
   * 클래스와 메소드에 final을 붙이면 상속할 수 없게 만듭니다.
   */

  final void finalDance() {
    System.out.println("둠칫 둠칫");
  }

}
