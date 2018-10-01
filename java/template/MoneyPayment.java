/**
 * MoneyPayment
 */
public class MoneyPayment extends Payment {

    public MoneyPayment(String payment) {
        this.payment = payment;
    }

    protected String getPayment() {
        return this.payment;
    }
}