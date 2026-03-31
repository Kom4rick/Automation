package Homework4;

public class Bankomat {
    int dvadtsatki;
    int poltosi;
    int sotki;
    int balance = 0;

    public Bankomat(int dvadtsatki, int poltosi, int sotki) {
        this.dvadtsatki = dvadtsatki;
        this.poltosi = poltosi;
        this.sotki = sotki;
        this.balance = dvadtsatki * 20 + poltosi * 50 + sotki * 100;
    }

    public void addition(int sotki, int poltosi, int dvadtsatki) {
        int b = dvadtsatki * 20 + poltosi * 50 + sotki * 100;
        if (dvadtsatki < 0 || poltosi < 0 || sotki < 0) {
            System.out.println("kolichestvo kupur ne mozhet bit otritsatelnoy");
            return;
        }
        this.sotki += sotki;
        this.poltosi += poltosi;
        this.dvadtsatki += dvadtsatki;
        this.balance += b;
    }

    public boolean withdraw(int money) {
        if (money > balance) {
            System.out.println("V bankomate stoka net");
            return false;
        }
        for (int i = sotki; i >= 0; i--) {
            int s = money - (i * 100);
            if (s < 0) {
                continue;
            }
            for (int j = poltosi; j >= 0; j--) {
                int p = s - j * 50;
                if (p < 0) {
                    continue;
                }
                if (p % 20 != 0 || dvadtsatki < p / 20) {
                    continue;
                } else {
                    sotki -= i;
                    poltosi -= j;
                    dvadtsatki -= p / 20;
                    System.out.println("bankomat vidal: " + i + " po 100, " + j + " po 50, " + p / 20 + " po 20");
                    return true;
                }
            }
        }
        System.out.println("bankomat ne mozhet vidat' takuyu summu");
        return false;
    }
}
