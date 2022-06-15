package module8OOP;

public class Main {
    public static void main(String[] args) {
        Animal[] herd = new Animal[7];
        herd[0] = new Horse("Horse1", 4, false);
        herd[1] = new Horse("Horse2", 4, false);
        herd[2] = new Kangaroo("Kangaroo1", 4, false);
        herd[3] = new Kangaroo("Kangaroo2", 4, false);
        herd[4] = new Dragonfly("Dragonfly1", 6, true);
        herd[5] = new Dragonfly("Dragonfly2", 6, true);
        herd[6] = new Animal("Unknown type", 10, true) {
        };
        Horse horse = new Horse("Horse3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo3", 4, false);
        Dragonfly dragonfly = new Dragonfly("Dragonfly3", 6, true);

        for (Animal animal : herd) {
            animal.voice();
        }
        horse.voice();
        kangaroo.voice();
        dragonfly.voice();


        for (Animal animal : herd) {
            animal.move();
        }
        horse.move();
        kangaroo.move();
        dragonfly.move();

        for (Animal animal : herd) {
            animal.isHungry();
        }
        horse.isHungry();
        kangaroo.isHungry();
        dragonfly.isHungry();
    }
}
