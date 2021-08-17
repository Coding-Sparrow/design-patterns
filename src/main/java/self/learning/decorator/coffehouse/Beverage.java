package self.learning.decorator.coffehouse;

public abstract class Beverage {
    protected String beverageName = "";

    public String getBeverageName() {
        return beverageName;
    }

    public abstract int getBeverageCost();
}
