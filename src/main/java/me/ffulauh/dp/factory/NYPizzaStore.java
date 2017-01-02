package me.ffulauh.dp.factory;

/**
 * Created by ffulauh on 2017/1/1.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else {
            return null;
        }
    }
}
