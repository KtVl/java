import java.util.Arrays;

public class Codewars7kyu {
    public static void main(String[] args) {
        int[] array = {3,2,3,4,5};
        //System.out.println(betterThanAverage(array,2));

        //System.out.println(switcheroo("aabbcc"));

        //System.out.print(delimitedWord("hello", "!", 3));

        System.out.println(reverseWords("This is an example!"));

    }

    /*Вы получаете массив с результатами тестов ваших сверстников.
    Теперь посчитайте среднее и сравните свой результат!
    Верни True, если твой лучше, иначе False!
Примечание:
    Ваши баллы не включены в массив баллов вашего класса.
    Для расчета среднего балла вы можете добавить свой балл в данный массив!*/
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int[] newClassPoints = new int[classPoints.length + 1];
        for (int i = 0; i < classPoints.length; i++) {
            newClassPoints[i] = classPoints[i];
        }
        newClassPoints[newClassPoints.length - 1] = yourPoints;    // Добавляем новый элемент в конец нового массива

        double size = newClassPoints.length;
        double sum = 0;
        for (int i = 0; i < newClassPoints.length; i++) {
            sum = sum + newClassPoints[i];
        }
        double avg = sum / size;

        if(yourPoints > avg) {
            return true;
        } else {
            return false;
        }
    }


    /*Дана строка, состоящая из букв a, b и/или c, поменяйте местами буквы a и b (замените a на b и наоборот).*/
    public static String switcheroo(String x) {
        return x.replace('a','0').replace('b','a').replace('0','b');
    }

    //вывести слово повторенное число раз с разделителем из второго параметра
    public static String delimitedWord(String str, String separator, int num) {
        String newStr = new String();
        for (int i = 0; i < num; i++){
            newStr += str + separator;
        } return newStr;
    }

    /*напишите функцию, которая принимает строковый параметр и переворачивает каждое слово в строке.
    Все пробелы в строке должны быть сохранены.
    Примеры
    "This is an example!" ==> "sihT si na !elpmaxe"
    "double  spaces"      ==> "elbuod  secaps"*/
    public static String reverseWords(final String original) {
        String[] words = new StringBuilder(original).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        String str = newStr.toString();
        return str;
    }

}
