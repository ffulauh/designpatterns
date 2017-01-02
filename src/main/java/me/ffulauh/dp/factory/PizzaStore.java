package me.ffulauh.dp.factory;

/**
 * Created by ffulauh on 2017/1/1.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
