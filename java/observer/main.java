/**
 Observerパターン要件
 ・ランダムな数字を１００回生成して1回づつObserverに通知
 ・１００回の数字の合計を表示するSubjectクラス
 ・３の倍数の時にYeaaaaa!!と表示するObserver
 ・５の倍数の時にSunshiiiiine!!と表示するObserver
 ・3の倍数かつ５の倍数の時にJuuuuustice!!と表示するObserver
 */
import java.util.Random;

public class main {

    public static void main(String[] arg) {
        // 繰り返す回数
        // int length = 100;
        // for demo
        int length = 10;
        // 乱数の範囲
        int range = 100;
        // 合計値
        int sum = 0;

        // オブジェクトの定義
        Random random = new Random();
        Subject subject = new Subject();
        
        for (int i = 0; i < length; i++) {
            // 乱数を生成し、合計値に追加
            int rand = random.nextInt(range);
            sum += rand;
            
            // for debug
            System.out.println("乱数"+rand+", 合計値"+sum);
            // Observerに通知
            subject.notifyObserver(sum);
        }
        // 合計値の
        subject.viewSum(sum);
    }
}