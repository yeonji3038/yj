package ex1;

// NOTE : 상속
// People.java 참고

public class ex1main {
  public static void main(String[] args) {
    ex1People people = new ex1People("Lee", 36, "good place");
    people.introduce();

    ex1Teacher teacher = new ex1Teacher("Kim", 37, "very good place", "good school");
    teacher.introduce();
  }
}
