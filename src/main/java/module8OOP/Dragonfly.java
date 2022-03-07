package module8OOP;

public class Dragonfly extends Animal {
    public Dragonfly(String animalName, int footNumber, boolean hasMustache) {
        super(animalName, footNumber, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("flight");
    }

    @Override
    public void voice() {
        System.out.println("Bj-w-w");
    }

    @Override
    public void isHungry() {
        System.out.println("I want insect");
    }
}
