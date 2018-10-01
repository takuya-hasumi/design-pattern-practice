/**
 * Payment
 */
public abstract class Payment {

    String payment;

    protected abstract String getPayment();

    public void pay() {
        String payment = this.getPayment();
        System.out.println(payment + "で支払いました。");
    }

}