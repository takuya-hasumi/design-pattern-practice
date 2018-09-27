/**
 * Main
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] arg) {
        // おばちゃんとさくらさんを具象
        Obachan obachan = new Obachan();
        Sakurasan sakurasan = new Sakurasan();
        // タスクリストを作成
        HashMap<String, String> task = new HashMap<String, String>();
        // タスクリストにタスクを追加
        task.put("購入", "IntelliJ");
        task.put("継続", "JIRA");
        // さくらさんに仕事を依頼
        obachan.ask(sakurasan, task);
        // さくらさんタスクを実行
        if (sakurasan.works != null) {
            sakurasan.execWork();
        }
        
        // HashMap<String, String> obachan_task = new HashMap<String, String>();
        // obachan_task.put("開発", "IT-trend");
        // sakurasan.ask(obachan, obachan_task);
        // if (obachan.works != null) {
        //     obachan.execWork();
        // }
    }
}