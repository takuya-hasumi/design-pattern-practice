/**
 * CreditCardPayment
 */
public class CreditCardPayment extends Payment {

    public CreditCardPayment(String payment) {
        this.payment = payment;
    }

    protected String getPayment() {
        System.out.println("クレジットカードの認証を行います。");
        System.out.println("クレジットカードの認証が完了しました。");
        return this.payment;
    }
}