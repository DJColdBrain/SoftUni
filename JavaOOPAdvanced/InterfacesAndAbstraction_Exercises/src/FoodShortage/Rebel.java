package FoodShortage;

public class Rebel implements Buyer {

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        food+=5;
    }

    @Override
    public int getFoodPurchased() {
        return this.food;
    }
}
