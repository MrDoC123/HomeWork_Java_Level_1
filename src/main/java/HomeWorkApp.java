public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    // 2 Задание!

    public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
    }

    // 3 задание!

    public static void checkSumSing() {
        int a = 1, b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная!");
        }
        else {
            System.out.println("Сумма отрицательная!");
        }
        }

        // 4 задание!

    public static void printColor() {
        int value = 101;
        if (value < 0) {
            System.out.println("Красный");
        }
        else if (value == 0 || value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
        }

        // 5 задание!

        public static void compareNumbers() {
        int a = 1, b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
        }

}
