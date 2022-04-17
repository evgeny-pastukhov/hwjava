public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;

    }

    public void run(int distance) {
        if (distance <= this.maxRunDistance) {
            System.out.println(this.name + " пробежал " + distance + "м");
        } else {
            System.out.println("Слишком далеко бежать");
        }
    }

    public void swim(int distance) {
        if (distance <= this.maxSwimDistance) {
            System.out.println(this.name + " проплыл " + distance + "м");
        } else {
            System.out.println("Слишком далеко плыть");
        }
    }
}