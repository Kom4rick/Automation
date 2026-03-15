public class Main {
    public static void main(String[] args) {
        //Практика 1 и 2
        int age = 27;
        System.out.println("Терехов Марк " + age);

        //Задача 1
        int b = 4;
        int c = 2;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);

        //Задачи 2 и 3
        int n = 104;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);

        //Задача 4
        double d = 5.4;
        System.out.println(Math.round(d));

        //Задача 5
        int q = 21;
        int w = 8;

        System.out.println(q / w + " и " + q % w + " в отстатке");

        //Задача *
        int s = 1;
        int v = 2;

        int o = s;
        s = v;
        v = o;

        System.out.println(s);
        System.out.println(v);

    }
}
