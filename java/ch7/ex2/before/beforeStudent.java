package ex2.before;

public class beforeStudent extends beforePeople {
  int grage;

  beforeStudent(String name, int age, String address, int grade) {
    super(name, age, address);
    this.grage = grade;
  }

}
