package me.ffulauh.dp.factory.abstractfactory;

/**
 * Created by ffulauh on 2017/1/2.
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
