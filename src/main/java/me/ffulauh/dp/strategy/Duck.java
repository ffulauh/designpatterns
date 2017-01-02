package me.ffulauh.dp.strategy;

/**
 * Created by ffulauh on 2016/12/24.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    public Duck(){}

    abstract void display();
    public void swim(){
        System.out.println("所有鸭子都会游泳");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performSound(){
        soundBehavior.sound();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
