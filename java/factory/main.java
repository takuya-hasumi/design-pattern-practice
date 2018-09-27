/**
 * main
 */
public class main {

    public static void main(String[] arg) {
        // factoryインスタンスを生成
        Factory factory = new PaymentFactory();
        // 支払い方法のインスタンスをそれぞれ生成
        Payment cash = factory.create("現金");
        Payment point = factory.create("ポイント");
        Payment credit_card = factory.create("クレジットカード");

        // 支払う
        cash.pay();
        point.pay();
        credit_card.pay();
    }

}