package ex3.solution;

public class ex3SolutionMain {
  public static void main(String[] args) {
    MiniCar miniCar = new MiniCar();
    SuperCar superCar = new SuperCar();

    specCheck(miniCar);
    specCheck(superCar);
  }

  public static void specCheck(Car car) {
    car.saySpec();
  }

}
