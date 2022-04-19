package lessons;

public class Lesson4 {

    public static void main(String[] args) {


        // square is a !circle
        String square = "Square";
        String circle = "Circle;";
        System.out.println(square != circle);

        // Если сегодня суббота, значит, завтра воскресенье.
        String today = "Saturday";
        String tomorrow;
        if(today == "Saturday") {
            tomorrow = "Sunday";
        }
        //если а > b и b < c, то присвоить а значение 7 и сложить b и с, иначе присвоить а значение 10
        int a = 19;
        int b = 12;
        int c = 13;
        if (a > b && b < c) {
            a = 7;
            int sum = b + c;
        } else {
            a = 10;
        }
        System.out.println(a);

       // практика

    // Проверьте число.
    // Если число нечетное и кратно трем,
    // то посчитайте результат деления на 3. Иначе
    // посчитайте результат умножения на три.
    // Если число Не нечетное, посчитайте произведение числа
    // на результат деления на 2.

    // Выведите результат работы алгоритма на печать.
    // Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

    // Напишите тест, который проверит работу вашего кода и выведет
    // на печать результат проверки.
    // Тестовые данные 23, 44, 21

    // AAA


        int n = 0;
        int expectedResult = 0;

        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println(n);

        // Test

        if (expectedResult == n) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }


}
