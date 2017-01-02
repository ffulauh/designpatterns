package me.ffulauh.dp.decorator;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return .2+beverage.cost();
    }
}
