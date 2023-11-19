package ex4;

// ex4Animal.java 참조
public class ex4main {
  public static void main(String[] args) {
    ex4Bird bird = new ex4Bird();
    bird.sound();

    ex4Cat cat = new ex4Cat();
    cat.sound();

    animalSound(new ex4Bird());
    animalSound(new ex4Cat());
  }

  public static void animalSound(ex4Animal animal) {
    animal.sound();
  }

}
