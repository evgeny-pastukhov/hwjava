public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (this.food>=appetite) {
            food -= appetite;
            return true;
        } else {
            System.out.println("Еды недостаточно!");
            return false;
        }
    }

    public void addFood(int add) {
        this.food += add;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("[ " + food + " ]");
    }
}
