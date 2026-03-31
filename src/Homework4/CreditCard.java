package Homework4;

public class CreditCard {
    int account_number;
    int dep;

    public CreditCard(int account_number, int dep) {
        this.account_number = account_number;
        this.dep = dep;
    }

    public void addition(int money) {
        dep += money;
    }

    public void withdraw(int money) {
        dep -= money;
    }

    public void cardInfo() {
        System.out.println("Номер счёта: " + account_number);
        System.out.println("Баланс: " + dep);
    }
}

