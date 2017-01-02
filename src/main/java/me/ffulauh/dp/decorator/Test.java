package me.ffulauh.dp.decorator;

/**
 * Created by ffulauh on 2016/12/25.
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        beverage=new Whip(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
    }
}
