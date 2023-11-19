package ex4.solution;

public class MiniCar extends Car {

  MiniCar() {
    this.color = "yellow";
    this.engine = "mini engine";
    this.maxPeople = 4;
  }

  @Override
  public void saySpec() {
    System.out.println("This is MiniCar");
    System.out.println("color:" + this.color + " engine:" + this.engine + " maxPeople:" + this.maxPeople);
  }

}
