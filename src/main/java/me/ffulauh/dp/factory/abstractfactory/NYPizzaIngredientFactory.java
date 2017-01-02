package me.ffulauh.dp.factory.abstractfactory;

/**
 * Created by ffulauh on 2017/1/1.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
