/**
 * Person
 */
import java.util.HashMap;

public abstract class Person {

    protected HashMap works;

    /**
     * worksフィールドにタスクをセット
     */
    protected void setWork(Person person, HashMap task) {
        person.works = task;
    }
    
    /**
     * タスクを実行する
     */
    abstract void execWork();

    /**
     * Personクラスにタスクを依頼
     * worksフィールドにタスクをセット
     */
    public void ask(Person person, HashMap task) {
        person.setWork(person, task);
    }

    /**
     * 帰宅する
     */
    protected static void drn() {
        System.out.println("本日はこれにてDRNさせていただきマス");
    }
}