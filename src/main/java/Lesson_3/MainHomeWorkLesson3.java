package Lesson_3;


import java.util.Arrays;

public class MainHomeWorkLesson3 {
    public static int[] main(String[] args) {
        int[] generateReturn = generateReturn (15, 5);

        // Задание 1!

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }

        // Задание 2!

        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = i + 1;
        }
        System.out.println("\n" + (Arrays.toString(arr1)));


        // Задание 3!

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6)
                arr2[i] *= 2;
        }
        System.out.println("\n" + (Arrays.toString(arr2)));

        // Задание 4!

        int [ ][ ] array = new int [ 4 ][ 4 ];
        
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        System.out.println(Arrays. toString(array));

        // Задание 5!

        private static int[]  generateArray(int len, int initialValue) {
            int [] arrReturn = new int[len];
            for (int i = 0; i < arrReturn.length; i++) {
                arrReturn[i] = initialValue;
            }
            return arrReturn;
        }
    }
}