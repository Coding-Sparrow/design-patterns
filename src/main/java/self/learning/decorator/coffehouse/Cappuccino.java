package self.learning.decorator.coffehouse;

public class Cappuccino extends Beverage {

    public Cappuccino(){
        beverageName = "Cappuccino Coffee";
    }

    @Override
    public int getBeverageCost() {
        return 10;
    }
}
