public class Main {
    public static void main(String[] args) {
        // Encapsulation and abstraction with regular Pizza
        Pizza basePizza = new Pizza(true); // Veg pizza
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();

        System.out.println("-----------------------------------");

        // Inheritance and polymorphism with Deluxe Pizza
        DeluxPizza deluxPizza = new DeluxPizza(true); // Non-veg deluxe pizza
        deluxPizza.takeAway();
        deluxPizza.getBill();
    }
}
