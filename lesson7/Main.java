package lesson7;

public class Main {
    public static void main(String[] args) {
        //Cat[] cats = new Cat("Barsik", 105);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас",30);
        cats[1] = new Cat("Бегемот",45);
        cats[2] = new Cat("Филипп Маркович",50);
        Plate plate = new Plate(100);
        System.out.println(plate);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(plate);
        }
        plate.addFood(100);
        System.out.println(plate);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(plate);
        }

    }
}
