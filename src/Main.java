public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        for (int a = 10; a > 0; a = a - 1) {
            System.out.println("Итерация цикла " + a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        for (int b = 0; b < 17; b = b + 2) {
            System.out.println("Итерация цикла " + b);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println("Итерация цикла " + c);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println("Високосный год " + d);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);

        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);

        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int salary = 29000;
        int total = 0;
        for (int h = 1; h <= 12; h = h + 1) {
            total = total + salary;
            System.out.println("Месяц " + h + " , сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task9() {
        System.out.println("Задача 9");

        int salary = 29000;
        int total = 0;
        for (int h = 1; h <= 12; h = h + 1) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + h + " , сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task10() {
        System.out.println("Задача 10");

        int math = 2;
        int total =0;
        for (int v = 1; v <= 10; v = v + 1) {
            total = total + math;
            System.out.println("2*" + v + "=" + total);

        }
    }
}
