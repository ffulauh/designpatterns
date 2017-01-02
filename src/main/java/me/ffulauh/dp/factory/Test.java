package me.ffulauh.dp.factory;

/**
 * Created by ffulauh on 2017/1/1.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Han ordered a "+pizza.getName()+"\n");
    }
}
