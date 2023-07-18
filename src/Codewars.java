public class Codewars {
    public static void main(String[] args) {
        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);

        String str = "hello";
        System.out.println(remove(str));

        int[] array = {1,2,3,6,5};
        System.out.println(findAverage(array));
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
}

