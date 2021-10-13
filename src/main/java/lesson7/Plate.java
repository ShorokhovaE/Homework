package lesson7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public boolean decreaseFood(int amount){
        if(amount > food){
            return false;
        }
        food -= amount;
        return true;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

    public void addFoodToPlate(int amount){
        food += amount;
    }
}
