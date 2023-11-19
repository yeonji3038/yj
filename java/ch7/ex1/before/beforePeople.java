package ex1.before;

public class beforePeople {
  public String name;
  public int age;
  public String address;

  public beforePeople(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  void introduce() {
    System.out.println("My name is " + this.name + " nice to meet you!");
  }

  final void finalDance() {
    System.out.println("둠칫 둠칫");
  }

}
