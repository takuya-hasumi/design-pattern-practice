/**
 * Subject
 * 
 * 100回の数字の合計を表示するクラス
 * 
 */

public class Subject {

    
    public void notifyObserver(int sum) {
        if ((sum % 5 == 0) && (sum % 3 == 0)) {
            JuuuuusticeObserver juuuuustice_observer = new JuuuuusticeObserver();
            juuuuustice_observer.notice();
        } else if (sum % 5 == 0) {
            SanshaiiiiinObserver sanshaiiiiin_observer = new SanshaiiiiinObserver();
            sanshaiiiiin_observer.notice();
        } else if (sum % 3 == 0) {
            YeaaaaahObserver yeaaaaah_observer = new YeaaaaahObserver();
            yeaaaaah_observer.notice();
        }
    }

    public void viewSum(int x) {
        System.out.println("合計値: " + x);
    }
}