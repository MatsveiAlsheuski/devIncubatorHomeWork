package module8OOP;

public class Kangaroo extends Animal {
    public Kangaroo(String animalName, int footNumber, boolean hasMustache) {
        super(animalName, footNumber, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("Jump-jump");
    }

    @Override
    public void voice() {
        System.out.println("Khe-khe");
    }

    @Override
    public void isHungry() {
        System.out.println("I want berries");
    }
}
