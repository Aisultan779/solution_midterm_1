package coffeeshop;

public class MilkDecorator extends coffeeshop.CoffeeDecorator {
    public MilkDecorator(coffeeshop.Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }
}
