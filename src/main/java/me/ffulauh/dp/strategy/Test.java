package me.ffulauh.dp.strategy;

/**
 * Created by ffulauh on 2016/12/24.
 */
public class Test {
    public static void main(String[] args) {
        Duck duck=new RedHeadDuck();
        duck.display();
        duck.performFly();
        duck.performSound();
        duck.swim();
    }
}
