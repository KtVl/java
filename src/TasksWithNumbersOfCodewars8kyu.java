import java.util.Arrays;


public class TasksWithNumbersOfCodewars8kyu {
    public static void main(String[] args) {
        int[] array = {1,-2,3,-6,5};
        System.out.println(Arrays.toString(invert(array)));

        System.out.println(paperWork(5,5));

        System.out.println(areaOrPerimeter(3,3));

        int[] numbers = {1,2,3,6,5};
        System.out.println(sum(numbers));

        System.out.println(sumArr(array));

        System.out.println("---------");

        System.out.println(sumMul(5,20));

        System.out.println(Arrays.toString(minMax(numbers)));

        System.out.println(Arrays.toString(map(numbers)));
    }

    // Напишите функцию, которая вычисляет среднее значение чисел в заданном списке.
    public static double findAverage(int[] array) {
        double size = array.length;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / size;
        return avg;
    }

    // Учитывая набор чисел, верните аддитивное значение,
    // обратное каждому из них. Каждое положительное становится отрицательным,
    // а отрицательное становится положительным.
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * -1;
            } return array;
        }

    /*Ваши одноклассники попросили вас скопировать для них кое-какие документы.
    Вы знаете, что есть "n" одноклассников, а в документах есть "m" страниц.
    Ваша задача - подсчитать, скольк страниц вам нужно. Если n < 0 или m < 0, верните 0.*/
    public static int paperWork(int n, int m) {
        int paperwork = n * m;
        if (n < 0 || m < 0) {
            return 0;
        } return paperwork;
    }

    /*Вам заданы длина и ширина 4-стороннего многоугольника.
    Многоугольник может быть либо прямоугольником, либо квадратом.
    Если это квадрат, верните его площадь.
    Если это прямоугольник, верните его периметр.*/
    public static int areaOrPerimeter (int l, int w) {
        int p = 0;
        if (l > w || w > l) {
            p = 2 * (w + l);
        } else if ( w == l) {
            p = w * l;
        }return p;
    }

    // Суммируйте все числа данного массива, кроме самого высокого и самого низкого элемента
    public static int sum(int[] numbers) {
        Arrays.sort(numbers);
        int[] result = new int[numbers.length - 2];
        System.arraycopy(numbers, 1, result, 0, numbers.length - 2);
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
        return sum;
    }

    /*напишите метод, который преобразовывает число в строку*/
    public static String numberToString(int num) {
        String str = Integer.toString(num);
        return str;
    }

    /*найди сумму всех положительных чисел в массиве*/
    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sum = sum + arr[i];
            }
        } return sum;
    }

    /*Найдите сумму всех кратных n ниже m.
    если m или n <=0 бросить исключение IllegalArgumentException*/
    public static long sumMul(int n, int m) throws IllegalArgumentException {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if(i % n == 0){
                sum += i;
            }
        } return sum;
    }

    // Учитывая массив целых чисел, вернуть новый массив с удвоением каждого значения
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
        return arr;
    }

    //Напишите функцию, которая возвращает минимальное и максимальное количество заданного списка/массива
    //[1,2,3,4,5] --> [1,5]
    //[2334454,5] --> [5,2334454]
    //[1]         --> [1,1]
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}


