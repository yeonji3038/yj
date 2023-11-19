package ex3;

// NOTE : protected
// People.java 참조

public class ex3main {
  public static void main(String[] args) {
    ex3Teacher teacher = new ex3Teacher("Lee", 36, "korea");
    teacher.sayIntroduce();

    // NOTE : 자동 타입 변환
    /*
     * 클래스를 상속받음으로써 자식 클래스와 부모 클래스가 생기는데
     * 자식 클래스는 부모 클래스에 호환이 가능합니다.
     * Teacher, PoliceOfficer 는 People 를 상속받기 때문에
     * People형 변수에 저장이 가능합니다.
     * 
     * 자식 클래스가 부모 클래스로 자동 타입변환 되면서 저장되기 때문에
     * 자식 클래스에 선언된 필드나 메소드들을 사용할 수 없게됩니다.
     * 
     */
    ex3People people1 = new ex3PoliceOfficer("Kim", 30, "Seoul");
    people1.introduce();
    ex3People people2 = new ex3Teacher("Park", 32, "Incheon");
    people2.introduce();

    // NOTE : 강제 타입 변환
    /*
     * 자식에서 부모로 타입변환은 자동으로 이뤄지지만
     * 부모에서 자식으로 타입변환은 자동으로 되지 않습니다.
     * 
     * 이 때 강제 타입 변환을 사용해서 자식 타입으로 변환할 수 있습니다.
     * 조심해야할점은 자식 타입에서 부모 타입으로 변환된 경우만
     * 다시 자식 타입으로 캐스팅 가능하다는 점 입니다.
     * 
     */

    ex3Teacher teacher2 = (ex3Teacher) people2;
    teacher2.introduce();

    // NOTE : 다형성
    /*
     * 다형성은 객체간 호환이 가능한 점을 이용해서
     * 구현부는 동일하지만 결과는 입력받은 객체에 맞춰서 동작하도록 만든것을 말합니다.
     */

    ex3main someObj = new ex3main();
    someObj.someIntroduce(people1);
    someObj.someIntroduce(people2);
  }

  void someIntroduce(ex3People people) {
    if (people instanceof ex3Teacher) {
      System.out.println("Teacher 입니다요");
    } else if (people instanceof ex3PoliceOfficer) {
      System.out.println("PoliceOfficer 입니다요");
    }

    people.introduce();
    // NOTE : 객체 타입 확인
    /*
     * 입력받는 객체가 부모 객체와 호환되기 때문에 정확한 객체 타입을 알기 힘듭니다.
     * 이때 instanceof 를 이용해 객체 타입을 확인할 수 있습니다.
     */
  }

}
