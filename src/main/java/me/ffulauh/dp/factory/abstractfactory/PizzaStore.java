package me.ffulauh.dp.factory.abstractfactory;

/**
 * Created by ffulauh on 2017/1/2.
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);
    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);
        System.out.println("--- Making a "+pizza.getName()+" ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
