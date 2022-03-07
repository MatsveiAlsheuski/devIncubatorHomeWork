package module8OOP;

public abstract class Animal implements Movable, Starveble, Voiceable {
    String animalName;
    int footNumber;
    boolean hasMustache;

    public Animal() {
    }

    public Animal(String animalName, int footNumber, boolean hasMustache) {
        this.animalName = animalName;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    public void move() {
        System.out.println("movement");
    }

    public void isHungry() {
        System.out.println("not hungry");
    }

    public void voice() {
        System.out.println("voice");
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        this.footNumber = footNumber;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
