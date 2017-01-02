package me.ffulauh.dp.factory.abstractfactory;

/**
 * Created by ffulauh on 2017/1/2.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore=new NYPizzaStore();
        Pizza pizza=nyPizzaStore.orderPizza("cheese");
        System.out.println("Edward ordered a " + pizza + "\n");
    }
}
