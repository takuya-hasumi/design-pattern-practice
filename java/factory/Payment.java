/**
 * Payment
 */
public class Payment extends Money {

    public String payment;

    Payment(String payment) {
        this.payment = payment;
    }

    public void pay() {
        System.out.println(this.payment + "で支払いました。");
    }
}