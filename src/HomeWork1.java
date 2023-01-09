public class HomeWork1 {
    public static void main(String[] args) {
//        drawSquare();
//        checkSumSign();
//        checkHomework();
//        printColor();
//        howIsTheWeatherThere();
        compareNumbers();
    }

    //    Создайте метод drawSquare(),
//    который при вызове должен отпечатать рисунок квадрата.
    public static void drawSquare() {
        System.out.println("-----");
        System.out.println("| |");
        System.out.println("-----");
    }

    //    Создайте метод checkSumSign(), в теле которого
//    объявите две int переменные a и b,
//    и инициализируйте их любыми значениями, которыми захотите.
//    Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”
    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    // Создайте метод checkHomework() в теле которого объявлена
// int переменная tasksCount (количество выполненных задач).
// В зависимости от значения переменной,
// метод должен напечатать в консоль оценку студента.
    public static void checkHomework() {
        int tasksCount = 3;

        if (tasksCount == 6) {
            System.out.println("Великолепно, Вы выполнили все задачи!");
        }
        if (tasksCount > 3 && tasksCount < 6) {
            System.out.println("Отлично, Вы выполнили почти все задачи!");
        }
        if (tasksCount <= 3) {
            System.out.println("Вы решили меньше половины, но Вы все равно молодец, надо же с чего-то начинать!!");
        }

        System.out.println("Проверка завершена");
    }


    //  Создайте метод printColor() в теле которого
//  задайте int переменную value и инициализируйте ее любым значением.
//  Если value меньше 0 (0 включительно),
//  то в консоль метод должен вывести сообщение “Красный”,
//  если лежит в пределах
//  от 0 (0 исключительно) до 100 (100 включительно),
//  то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”
    public static void printColor() {
        int value = 108;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //    Создайте метод howIsTheWeatherThere()
//    в теле которого объявлена int переменная temperature.
//    В зависимости от значения переменной, метод должен оценить погоду на улице.
    public static void howIsTheWeatherThere() {
        int temperature = 4;

        if (temperature > 10) {
            System.out.println("На улице очень даже тепло для марта месяца");
        } else if (temperature > -5) {
            System.out.println("Для марта самое то");
        } else {
            System.out.println("Там точно весна?");
        }
    }

//    Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//    и инициализируйте их любыми значениями, которыми захотите.
//    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers() {
      int a = 3;
      int b = 1;
      System.out.println (a >= b? "a >= b" : "a < b");
    }
}
