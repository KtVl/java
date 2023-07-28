import java.util.HashMap;

public class TasksWithStringsOfCodewars8kyu {
    public static void main(String[] args) {
        System.out.println(position("a"));

        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);

        String str = "hello";
        System.out.println(remove(str));

        System.out.println(updateLight("red"));

        System.out.println(greet("german"));

        System.out.println(validatePin("1234"));
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

    //Напишите функцию «приветствия», которая принимает параметр «язык»
    // (всегда строка) и возвращает приветствие, если оно есть в вашей базе данных.
    // По умолчанию должен быть английский, если языка нет в базе данных или в случае неверного ввода
    public static String greet(String language){
        HashMap<String, String> map = new HashMap<>();

        map.put("english", "Welcome");
        map.put("czech", "Vitejte");
        map.put("danish", "Velkomst");
        map.put("dutch", "Welkom");
        map.put("estonian", "Tere tulemast");
        map.put("finnish", "Tervetuloa");
        map.put("flemish", "Welgekomen");
        map.put("french", "Bienvenue");
        map.put("german", "Willkommen");
        map.put("irish", "Failte");
        map.put("italian", "Benvenuto");
        map.put("latvian", "Gaidits");
        map.put("lithuanian", "Laukiamas");
        map.put("polish", "Witamy");
        map.put("spanish", "Bienvenido");
        map.put("swedish", "Valkommen");
        map.put("welsh", "Croeso");

        return map.getOrDefault(language, map.get("english"));
    }

    /*Банкоматы позволяют использовать 4- или 6-значные PIN-коды,
    а PIN-коды не могут содержать ничего, кроме ровно 4 или ровно 6 цифр.
    Если функции передана допустимая строка PIN-кода, верните true, иначе верните false.
    Примеры ( Ввод --> Вывод)
    "1234"   -->  true
    "12345"  -->  false
    "a234"   -->  false*/
    public static boolean validatePin(String pin) {
        //Чтобы проверить все ли символы цифры
        boolean isOnlyDigits = true;
        for(int i = 0; i < pin.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(pin.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        if (isOnlyDigits == true) {
            if(pin.length() == 4 || pin.length() == 6) {
                return true;
            }
        } return false;
    }
}
