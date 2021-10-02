package lesson3;

import java.util.Arrays;
import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {

    }

    public static void task1() {    // задание № 1
        int[] arr1 = {0, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void task2() {    // задание № 2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void task3() {    // Задание № 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr3[1] < 6 ? arr3[i] *= 2 : arr3[i];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void task4() {    //  Задание № 4
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, k = (arr4.length - 1); j < arr4.length; j++, k--) {
                if (i == 0) {
                    arr4[i][0] = 1;
                    arr4[j][k] = 1;
                } else if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5() {    // Задание № 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите длину массива");
        int len = sc.nextInt();
        System.out.println("Укажите значение, которое будет заполнено в массиве");
        Scanner sc1 = new Scanner(System.in);
        int initialValue = sc1.nextInt();
        System.out.println(Arrays.toString(ArrayInitialValue(len, initialValue)));
    }

    public static int[] ArrayInitialValue(int len, int initialValue){

            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            return arr;
        }



    public static void ArrayMinAndMax() {   // задание № 6

        int[] arr = {-1, 2, -3, -10, 900, -567};
        System.out.println("Массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Миниальный элемент массива: " + arr[0]);
        System.out.println("Максимальный элемент массива: " + arr[(arr.length - 1)]);

    }

    public static boolean prtArray(int[] array) {   // задание № 7

        int sum = 0;
        for (int i = 0; i < array.length; i++) {    // посчитали сумму всех элементов массива
            sum += array[i];
        }

        int sumRigth = array[(array.length - 1)];   // Сумма правой части
        int sumLeft = sum - sumRigth;   // Сумма левой части

        for (int i = (array.length - 1); i > 0; i--) {
            if (sumRigth == sumLeft) {  // проверяем, равны ли суммы правой и левой части
                return true;
            } else {
                sumRigth += array[(i - 1)]; // вычитаем из правой части еще один элемент
                sumLeft -= array[(i - 1)];  // добавляем к левой части еще один элемент
            }
        }
        return false;
    }

    public static void MoveArray (int[] array, int n){  // Задание № 8

        if ( n > 0){    // вызываем соответствующий метод в зависимости от того, в какую сторону двигаемся
            MoveArrayToTheLeft(array, n);
        } else if (n < 0) {
            MoveArrayToTheRigth(array, n);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void MoveArrayToTheLeft(int[] array, int n){

        for (int i = 1; i <= n; i++) {
            int x = array[0];
            for (int j = 0; j < array.length; j++) {
                array[j] = (j + 1) >= array.length ? x : array[j + 1];
            }
        }
    }
    public static void MoveArrayToTheRigth (int[] array, int n){

        for (int i = -1; i >= n; i--) {
            int x = array[(array.length - 1)];
            for (int j = (array.length - 1); j >= 0; j--) {
                array[j] = (j - 1) < 0 ? x : array[j - 1] ;
            }
        }
    }
}


