/**
 * Factory
 */
public abstract class Factory {

    public Payment create(String payment) {
        Payment pay = this.createPayment(payment);
        return pay;
    }

    public abstract Payment createPayment(String payment);
}