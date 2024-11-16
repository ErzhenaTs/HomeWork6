//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }


        System.out.println("Задача 2");
        for (int e = 10; e >= 1; e--) {
            System.out.println(e);
        }


        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a + 2) {
            System.out.println(a);
        }


        System.out.println("Задача 4");
        for (int b = 10; b >= -10; b--) {
            System.out.println(b);
        }


        System.out.println("Задача 5");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }


        System.out.println("Задача 6");
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println(t);
        }


        System.out.println("Задача 7");
        for (int w = 1; w <= 512; w = w * 2) {
            System.out.println(w);
        }


        System.out.println("Задача 8");
        int savings = 29000;
        int total = 0;
        for (int mounth = 1; mounth <= 12; mounth++ ) {
            total = total + savings;
        System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total + " рублей");}


        System.out.println("Задача 9");
        int savings2 = 29000;
        int total2 = 0;
        for (int h = 1; h <= 12; h++) {
            total2 = total2 + savings2;
            total2 = total2 + total2/100;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total2 + " рублей");
        }


        System.out.println("Задача 10");
        int u = 2;
        for (int o = 1; o < 10; o++) {
            System.out.println("2 * " + o + " = " + u * o);
        }





    }
}