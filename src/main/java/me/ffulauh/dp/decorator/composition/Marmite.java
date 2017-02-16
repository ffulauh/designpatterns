package me.ffulauh.dp.decorator.composition;

/**
 * Created by ffulauh on 2017/2/9.
 * 砂锅抽象类
 */
public abstract class Marmite {
    String description = "砂锅";

    public String getDescription() {
        return description;
    }

    public abstract Integer cost();

    @Override
    public String toString() {
        return "这是一碗：" + getDescription() + "，价格：" + cost() + "元";
    }
}
