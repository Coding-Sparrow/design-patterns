package self.learning.decorator.coffehouse;

public class Milk extends CoffeeHouseDecorator{
    Beverage beverage;

    Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public int getBeverageCost() {
        return beverage.getBeverageCost()+2;
    }

    @Override
    public String getBeverageName() {
        return beverage.beverageName + " with Milk";
    }
}
