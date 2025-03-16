package coffeeshop;

public class Americano implements Coffee {
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}
