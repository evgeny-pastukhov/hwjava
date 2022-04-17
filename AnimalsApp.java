public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");
        cat.run(20);
        dog.run(50);
        cat.swim(20);
        dog.swim(9);
    }
}
