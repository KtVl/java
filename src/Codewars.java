import java.util.Arrays;

public class Codewars {
    public static void main(String[] args) {
        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);

        String str = "hello";
        System.out.println(remove(str));

        int[] array = {1,-2,3,-6,5};
        System.out.println(Arrays.toString(invert(array)));

        System.out.println(paperWork(5,5));
    }

    //Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
    public static String smash(String[] words) {
        String arrayToString = String.join(" ", words);
        System.out.println(arrayToString);
        return arrayToString;
    }


    // создать функцию, которая удаляет первый и последний символы строки
    public static String remove(String str) {
        String str2 = str.substring(1, str.length() - 1);
        return str2;
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
    }


