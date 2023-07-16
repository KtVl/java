import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
//        swap0By1();
//        fillArray();
//        changeArray();
//        fillDiagonal();
//        findMinMax();
//        createAndFillArray();
        retLenArr(5,0);

    }
        // Задать целочисленный массив,
// состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

        public static void swap0By1() {
            int[] arr = {0, 1, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println(arr[i] = 1);
                } else {
                    System.out.println(arr[i] = 0);
                }
            }
        }

// Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        public static void fillArray() {
            int[] arr = new int[101];
            for (int i = 1; i < arr.length; i++) {
                System.out.print(i + " ");
            }
        }

//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;
        public static void changeArray() {
            int[] arr = {1, 5, 6, 2, 11,};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    System.out.println(arr[i] * 2);
                } else {
                    System.out.println(arr[i]);
                }
            }
        }

//     Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//     и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//     (можно только одну из диагоналей, если обе сложно).
//     Определить элементы одной из диагоналей можно по следующему принципу:
//     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        public static void fillDiagonal() {
            int[][] matrix = new int[4][4];
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - i - 1] = 1;
            }
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }

//        Написать метод, принимающий на вход два аргумента: len и initialValue,
//        и возвращающий одномерный массив типа int длиной len,
//        каждая ячейка которого равна initialValue;

         public static int[] retLenArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        } return arr;
    }



    // Задать одномерный массив и найти в нем минимальный и максимальный элементы
        public static void findMinMax(){
         int[] array = {2,5,8,4,6,2,6,8,33};
         int min = array[0];
         int max = array[0];
         for (int i = 0; i < array.length; i++) {
             if (array[i] < min) {
                 min = array[i];
             }
         }
         for (int j = 0; j <array.length; j++) {
             if (array[j] > max) {
                 max = array[j];
             }
         }
            System.out.println("max: " + max + ",   min: " + min);
        }


}
