/**
 * Sakurasan
 */
import java.util.HashMap;

public class Sakurasan extends Person {

    /**
     * 購入申請とか継続申請とかする
     */
    @Override
    public void execWork() {
        if (works.containsKey("購入")) {
            this.execPurchase(works);
        }
        if (works.containsKey("継続")) {
            this.execContinuation(works);
        }
        System.out.println("すべて完了です！");
        this.drn();
    }

    private void execPurchase(HashMap works) {
        System.out.println(works.get("購入") + "を購入しました！");
    }

    private void execContinuation(HashMap works) {
        System.out.println(works.get("継続") + "の継続手続きが完了しました！");
    }
}