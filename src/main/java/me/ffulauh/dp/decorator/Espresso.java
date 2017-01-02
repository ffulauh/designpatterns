package me.ffulauh.dp.decorator;

/**
 * 浓缩咖啡
 * Created by ffulauh on 2016/12/25.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 2;
    }
}
