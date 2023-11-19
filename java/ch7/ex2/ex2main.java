package ex2;

import ex1.ex1Teacher;

// NOTE : 메소드 오버라이딩
/*
 * Teacher.java 참조
 */

public class ex2main {
  public static void main(String[] args) {
    ex1Teacher teacher = new ex1Teacher("Lee", 36, "korea", "good school");
    teacher.introduce();
  }

}
