/**
 * PaymentFactory
 */
public class PaymentFactory extends Factory {

    public Payment createPayment(String payment) {
        return new Payment(payment);
    }
}