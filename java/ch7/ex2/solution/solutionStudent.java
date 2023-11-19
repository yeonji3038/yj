package ex2.solution;

public class solutionStudent extends solutionPeople {
  int grage;

  solutionStudent(String name, int age, String address, int grade) {
    super(name, age, address);
    this.grage = grade;
  }

  @Override
  void introduce() {
    System.out.println("Hi teacher! My name is " + this.name + ". Nice to meet you");
  }

}
