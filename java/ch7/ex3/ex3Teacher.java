package ex3;

public class ex3Teacher extends ex3People {

  ex3Teacher(String name, int age, String address) {
    super(name, age, address);
  }

  void sayIntroduce() {
    this.introduce();
    System.out.println("I'm your teacher");
  }

}
