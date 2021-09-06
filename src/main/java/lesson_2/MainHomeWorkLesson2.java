package lesson_2;

public class MainHomeWorkLesson2 {
    public static void main(String[] args) {
        sum(15, 6);
        printToConsole(4);
        System.out.println(NegativeAndPositive(10));
        printNameNumber("Bob", 4 );
    }

    // 1 Задание!

    public static void sum(int a, int b) {
        int sum1 = a + b;
        if (sum1 >= 10 && sum1 <= 20) {
            System.out.println("Число положительное " + sum1);
        }
        else {
            System.out.println("Сумма за пределами диапозона!" + "\nСумма чисел в диапозоне: " + "от " + 10 + " до " + 20);
        }
    }

    // 2 Задание!

    public static void printToConsole(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    // 3 Задание!

    public static boolean NegativeAndPositive(int d) {
            return d < 0;
    }

    // 4 Задание!

    public static void printNameNumber(String name, int number) {
        for (number = 0; number < 4; number++) {
            System.out.println(number + ". " + name);
        }
    }
}
