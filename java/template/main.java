/**
 * main
 */
public class main {

    public static void main(String[] arg) {
        Payment money = new MoneyPayment("現金");
        Payment credit_card = new CreditCardPayment("クレジットカード");

        money.pay();
        credit_card.pay();
    }

}