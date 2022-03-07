package module8OOP;

public class Horse extends Animal {

    public Horse(String animalName, int footNumber, boolean hasMustache) {
        super(animalName, footNumber, hasMustache);
    }

    @Override
    public void move() {
        System.out.println("Top-top");
    }

    @Override
    public void voice() {
        System.out.println("I-go-go");
    }

    @Override
    public void isHungry() {
        System.out.println("I want hay");
    }
}
