package ex1.solution;

public class solutionStudent extends solutionPeople {
  int grage;

  solutionStudent(String name, int age, String address, int grade) {
    super(name, age, address);
    this.grage = grade;
  }

}
