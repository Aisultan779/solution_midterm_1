package coffeeshop;

import java.util.Scanner;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop Simulator!");
        System.out.println("Select your coffee base (Espresso, Cappuccino, Latte, Americano): ");
        String coffeeType = scanner.nextLine();
        coffeeshop.Coffee coffee;
        try {
            coffee = coffeeshop.CoffeeFactory.createCoffee(coffeeType);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid coffee type selected. Exiting.");
            return;
        }

        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Do you want to add a topping? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Select topping: 1. Milk, 2. Caramel Syrup, 3. Whipped Cream, 4. Chocolate Syrup");
                String toppingChoice = scanner.nextLine();
                switch(toppingChoice) {
                    case "1":
                        coffee = new Coffee() {
                            @Override
                            public double getCost() {
                                return 0;
                            }

                            @Override
                            public String getDescription() {
                                return null;
                            }
                        };
                        break;
                    case "2":
                        coffee = new CaramelDecorator(coffee);
                        break;
                    case "3":
                        coffee = new WhippedCreamDecorator(coffee);
                        break;
                    case "4":
                        coffee = new ChocolateDecorator(coffee);
                        break;
                    default:
                        System.out.println("Invalid topping selection.");
                }
            } else {
                addingToppings = false;
            }
        }

        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());
        scanner.close();
    }
}
