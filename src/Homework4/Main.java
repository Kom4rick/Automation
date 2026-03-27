package Homework4;

public class Main {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(123, 0);
        CreditCard card0 = new CreditCard(456, 0);
        CreditCard card1 = new CreditCard(789, 1000);

        card.addition(100);
        card0.addition(200);
        card1.withdraw(100);

        card.cardInfo();
        card0.cardInfo();
        card1.cardInfo();

        Bankomat b = new Bankomat(5, 5, 5);
        b.addition(1, 2, 5);
        b.withdraw(670);
    }
}
