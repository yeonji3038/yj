package ex4.solution;

public class SuperCar extends Car {

  SuperCar() {
    this.color = "red";
    this.engine = "super engine";
    this.maxPeople = 1;
  }

  @Override
  public void saySpec() {
    System.out.println("This is SuperCar");
    System.out.println("color:" + this.color + " engine:" + this.engine + " maxPeople:" + this.maxPeople);

  }

}
