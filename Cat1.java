public class Cat1 {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eatFood(Plate plate) {
        satiety = plate.decreaseFood(appetite);
        if (satiety) {
            System.out.println("Котик " + this.name + " сыт!");
        } else {
            System.out.println("Бедный котик!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("[ " + name + " " + appetite + " ]");
    }
}
