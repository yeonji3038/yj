package ex3;

public class ex3PoliceOfficer extends ex3People {

  ex3PoliceOfficer(String name, int age, String address) {
    super(name, age, address);
  }

  protected void introduce() {
    System.out.println("My name is " + this.name);
    System.out.println("I'm police officer!");
  }

}
