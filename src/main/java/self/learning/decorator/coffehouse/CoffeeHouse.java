package self.learning.decorator.coffehouse;

public class CoffeeHouse {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeverageCost());
        beverage = new Milk(beverage);
        System.out.println("Espresso after adding milk");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeverageCost());
        beverage = new Cream("Light Cream",2,beverage);
        System.out.println("Espresso after adding cream");
        System.out.println(beverage.getBeverageName());
        System.out.println(beverage.getBeverageCost());
    }
}
