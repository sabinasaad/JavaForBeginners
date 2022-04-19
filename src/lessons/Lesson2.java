package lessons;

public class Lesson2 {

    public static void main (String[] args) {

        String line = "_________________________";
        int a = 5;
        int b = 13;
        int c = 113;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int d = -3;
        int multAB = a * b;
        int devBA = b / a;

        //конкатенация
        System.out.println(line);
        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);

        //арифметическое сложение
        System.out.println(line);
        System.out.println("The sum of A and B = " + (a + b));
        System.out.println("The sum of A and B = " + sumAB);
        System.out.println(a+b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        //конкатенация2
        System.out.println(line);
        System.out.print("Сегодня");
        System.out.println(" суббота");

        //арифметическое вычитание
        System.out.println(line);
        System.out.println(b-a);
        System.out.println(subBA); //если результат выч-я внести в переменную, расчет производится лишь 1 раз
        System.out.println(d);
        System.out.println(a- d);
        System.out.println(a + d);

        //арифметика + конкатенация
        //до стринга (кавычек) это арифм.выражение, а после - конкатенация
        System.out.println(line);
        System.out.println(a + b + " " + a + b);

        //кавычки внутри стринга
        System.out.println(line);
        System.out.println("Он сказал \"поехали\" и махнул рукой.");

        //умножение
        System.out.println(line);
        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        //деление
        System.out.println(line);
        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);

        //остаток от деления
        System.out.println(line);
        System.out.println(b % a);
        System.out.println(a % b);

        //покажите, что 25 кратно 5
        System.out.println(line);
        System.out.println(25 % 5);

        //100 не кратно 3
        System.out.println(100 % 3);

        //унарные операторы     a++  = a + 1
       // прибавляет, но не печатает с +1 System.out.println(a++);
        System.out.println(line);
        System.out.println(a);
        System.out.println(a + 1);
        //b-- = b - 1
        b--;
        System.out.println(b);
        System.out.println(b - 1);
    }
}
