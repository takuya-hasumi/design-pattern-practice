/**
 * Subject
 * 
 * 100回の数字の合計を表示するクラス
 * 
 */

public class Subject {

    
    public void notifyObserver(int sum) {
        if ((sum % 5 == 0) && (sum % 3 == 0)) {
            JuuuuusticeObserver.viewJuuuuustice();
        } else if (sum % 5 == 0) {
            SanshaiiiiinObserver.viewSanshaiiiiin();
        } else if (sum % 3 == 0) {
            YeaaaaahObserver.viewYeaaaaah();
        }
    }

    public void viewSum(int x) {
        System.out.println("合計値: " + x);
    }
}