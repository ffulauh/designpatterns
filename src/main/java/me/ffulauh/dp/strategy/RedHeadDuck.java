package me.ffulauh.dp.strategy;

/**
 * Created by ffulauh on 2016/12/24.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior=new FlyWithWings();
        soundBehavior=new Quack();
    }

    @Override
    void display() {
        System.out.println("我是红头鸭");
    }
}
