/**
 * JuuuuusticeObserver
 */
public class JuuuuusticeObserver implements Observer {

    static String Juuuuustice = "Juuuuustice!!";

    public void notice() {
        JuuuuusticeObserver.viewJuuuuustice();
    }

    public static void viewJuuuuustice() {
        System.out.println(Juuuuustice);
    }
}