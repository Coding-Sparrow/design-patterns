package self.learning.decorator.coffehouse;

public class Espresso extends Beverage{

    public Espresso(){
        beverageName = "Espresso Coffee";
    }

    @Override
    public int getBeverageCost() {
        return 12;
    }
}
