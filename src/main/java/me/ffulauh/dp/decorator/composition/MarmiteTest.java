package me.ffulauh.dp.decorator.composition;

/**
 * Created by ffulauh on 2017/2/9.
 */
public class MarmiteTest {
    public static void main(String[] args) {
        Marmite marmiteNoddle = new NoddlesMarmite();
        System.out.println(marmiteNoddle.toString());
        Marmite muttonMarmiteNoddle = new MuttonMarmite(marmiteNoddle);
        System.out.println(muttonMarmiteNoddle.toString());
    }
}
