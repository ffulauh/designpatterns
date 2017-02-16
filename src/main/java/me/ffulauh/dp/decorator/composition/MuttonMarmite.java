package me.ffulauh.dp.decorator.composition;

/**
 * Created by ffulauh on 2017/2/9.
 */
public class MuttonMarmite extends MaterialDecorator {
    Marmite marmite;

    public MuttonMarmite(Marmite marmite) {
        this.marmite = marmite;
    }

    @Override
    public String getDescription() {
        return "羊肉、" + marmite.getDescription();
    }

    @Override
    public Integer cost() {
        return 5 + marmite.cost();
    }
}
