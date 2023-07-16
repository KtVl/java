

public class Lesson3 {
    public static void main(String[] args) {
//        printTable();
//        newArr();
        print2DArray();
    }

    public static void newArr() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }


//        int[] t = new int[24];
//        t[0] = -3;
//        t[6] = -1;
//        System.out.println(t[6]);


//        int[] arr = {123, 45, 22, 76, 567, 45};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }


//        int[] arr = {2, 4, 5, 1, 2, 3, 4, 5};
//        System.out.println("arr.length: " + arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    //создадим двумерный массив размером 3х4, заполним его числами от 1 до 12 и
//отпечатаем в консоль в виде таблицы.
    public static void printTable() {
        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

//    Печать двумерного прямоугольного массива с нумерацией строк и столбцов.
    public static void print2DArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

}
