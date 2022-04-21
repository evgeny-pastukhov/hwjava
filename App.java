public class App {
    public static void main(String[] args) {
        Cat1[] cats = new Cat1[4];
        cats[0] = new Cat1("Барсик", 150);
        cats[1] = new Cat1("Боб", 50);
        cats[2] = new Cat1("Кисун", 25);
        cats[3] = new Cat1("Сэм", 30);

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFood(plate);
            plate.info();
        }
        plate.addFood(100);
        plate.info();

    }
}

