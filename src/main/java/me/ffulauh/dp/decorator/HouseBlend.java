package me.ffulauh.dp.decorator;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
