/**
 * YeaaaaahObserver
 */
public class YeaaaaahObserver implements Observer {

    static String Yeaaaaah = "Yeaaaaah!!";

    public void notice() {
        YeaaaaahObserver.viewYeaaaaah();
    }

    public static void viewYeaaaaah() {
        System.out.println(Yeaaaaah);
    }
}