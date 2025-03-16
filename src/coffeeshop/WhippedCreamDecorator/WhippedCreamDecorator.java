package coffeeshop;

public class WhippedCreamDecorator extends coffeeshop.CoffeeDecorator {
    public WhippedCreamDecorator(coffeeshop.Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.6;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }
}
