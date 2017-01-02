package me.ffulauh.dp.decorator;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return .3+beverage.cost();
    }
}
