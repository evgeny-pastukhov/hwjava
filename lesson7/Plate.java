package lesson7;

public class Plate {
    private int food;
    public Plate (int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n){
        if (n <= food) {
            food -= n;
            return true;
        } else {
            System.out.println("В миске недостаточно еды!");
            return false;
        }
    }
    public void addFood(int b) {
        this.food += b;
    }
    @Override
    public String toString(){

        return "Plate:" + food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
