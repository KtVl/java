public class TasksWithStringsOfCodewars8kyu {
    public static void main(String[] args) {
        System.out.println(position("a"));

        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);

        String str = "hello";
        System.out.println(remove(str));

        System.out.println(updateLight("red"));
    }

    // Получив букву, верните ее положение в алфавите.
    //Ввод : "а"
    //Вывод : "1"
    public static int position(String a){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int rezult = alphabet.indexOf(a) + 1;
        return rezult;
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

    //Вы пишете код для управления светофорами в вашем городе.
    // Вам нужна функция для обработки каждого изменения с green,
    // на yellow, на red, а затем green снова
    public static String updateLight(String current) {
        switch (current) {
            case "red": return "green";
            case "yellow": return "red";
            case "green": return "yellow";
            default: throw new IllegalArgumentException();
        }
    }
}
