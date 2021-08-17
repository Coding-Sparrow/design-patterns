package self.learning.decorator.coffehouse;

public class Cream extends CoffeeHouseDecorator{
    private Beverage beverage;
    private String cream;
    private int creamCost;

    public Cream(String cream,int creamCost,Beverage beverage){
        this.beverage = beverage;
        this.cream = cream;
        this.creamCost =creamCost;
    }

    @Override
    public int getBeverageCost() {
        return beverage.getBeverageCost() + creamCost;
    }

    @Override
    public String getBeverageName() {
        return beverage.getBeverageName() + " with "+ cream;
    }
}
