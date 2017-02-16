package me.ffulauh.dp.decorator.composition;

/**
 * Created by ffulauh on 2017/2/9.
 */
public class NoddlesMarmite extends Marmite {

    public NoddlesMarmite() {
        description = "砂锅面条";
    }

    public Integer cost() {
        return 8;
    }
}
