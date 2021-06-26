package Kris.start.Money.step;


import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random rm = new Random();

    public static void main(String[] args) {


}
    public static void Task1() {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] += 1;
            } else if (arr[i] == 1) {
                arr[i] -= 1;
            }
        }
        {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void task2() {
        int[] arr = new int[8];

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x += 3;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void task3() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {     //(i+j==4) Диагональ в другую сторону
                    arr[i][j] += 1;

                }

            }

        }
        print(arr);
    }


    public static void print(int[][] arr) { //print Для 2d Массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();

        }

    }
}