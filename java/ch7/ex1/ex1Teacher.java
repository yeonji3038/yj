package ex1;

/*
 * Teacher 클래스는 People 클래스를 상속받습니다.
 * 상속은 'extends 클래스명' 으로 사용할 수 있습니다.
 * 상속은 다른 언어와 다르게 하나만 받을수 있습니다.
 */

public class ex1Teacher extends ex1People {

  String schoolName;

  /*
   * 부모 클래스에 생성자가 선언되어있는 경우 자식 클래스에서 사용할 수 있습니다.
   * super 메소드는 부모 클래스의 생성자를 호출하게 됩니다.
   * 만일 부모 클래스에 생성자가 선언되어 있으면 자식 클래스에서 생성자 호출을 해야합니다.
   */
  public ex1Teacher(String name, int age, String address, String schoolName) {
    super(name, age, address);
    this.schoolName = schoolName;
  }

  /*
   * 부모 클래스에서 정의된 메소드를 자식 클래스가 덮어씌우는것을 메소드 오버라이딩 이라고 합니다.
   * 오버라이딩 방법은 부모에 정의된 메소드 명칭과 매개변수 타입 및 갯수, 리턴타입을 모두 동일하게 구현하면 됩니다.
   */

  public void introduce() {
    System.out.println("Hi I'm your teacher!");
    System.out.println("My name is " + this.name);
  }

  /*
   * override 어노테이션은 생략 가능합니다.
   */
  // @Override
  // void introduce() {
  // System.out.println("Hi I'm your teacher!");
  // System.out.println("My name is " + this.name);
  // }

  // final void finalDance() {
  // System.out.println("둠칫 둠칫이 안돼!");
  // }

}
