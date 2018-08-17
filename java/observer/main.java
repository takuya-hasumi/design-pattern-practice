/**
 Observerパターンを使って、
 ランダムな数字を１００回生成して1回づつObserverに通知し、
 １００回の数字の合計を表示するSubjectクラス、
 ３の倍数の時にイエー！と表示するObserver
 ５の倍数の時にウッス！と表示するObserver
 のセットを作る
 */
import java.util.Random;

public class main {

    public static void main(String[] arg) {
        // 繰り返す回数
        int length = 100;
        // 乱数の範囲
        int range = 100;
        // 合計値
        int sum = 0;

        // オブジェクトの定義
        Random random = new Random();
        Subject subject = new Subject();
        
        for (int i = 0; i < length; i++) {
            int rand = random.nextInt(range);
            sum += rand;
            
            // for debug
            // System.out.println("乱数"+rand+", 合計値"+sum);
            // Observerに通知
            subject.notifyObserver(sum);
        }
        subject.viewSum(sum);
    }
}