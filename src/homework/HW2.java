package homework;

public class HW2 {

    public static void main (String[] args){

        // task 11
        int k = 2;
        int l = 7;
        int m = 33;
        String line  = "_____________________________";

        // task 12
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);
        //or
        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(line);

        // task 13
        System.out.println("" + k + l + m);
        System.out.println(line);
        //or
        System.out.print(k);
        System.out.print(l);
        System.out.println(m);
        System.out.println(line);

        // task 14
        System.out.println(k + ", " + l + ", " + m);
        System.out.println(line);

        // task 15
        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);
        System.out.println(line);

        // task 16
        System.out.println("sum of k and l = " + (k + l) );
        System.out.println("k * m = " + (k * m) );
        System.out.println("разность переменных l и m равна " + (l - m) );
        System.out.println(line);
        //or
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        System.out.println("sum of k and l = " + sumKL);
        System.out.println("k * m = " + multKM);
        System.out.println("разность переменных l и m равна " + subLM);
        System.out.println(line);

        // task 17
        int divKL = k / l;
        int divKM = k / m;
        int divLK = l / k;
        int divLM = l / m;
        int divML = m / l;
        int divMK = m / k;
        int remKL = k % l;
        int remKM = k % m;
        int remLK = l % k;
        int remLM = l % m;
        int remML = m % l;
        int remMK = m % k;

        System.out.println("Результат деления k на l = " + divKL + ", а остаток от деления  = " + remKL);
        System.out.println("Результат деления k на m = " + divKM + ", а остаток от деления  = " + remKM);
        System.out.println("Результат деления l на k = " + divLK + ", а остаток от деления  = " + remLK);
        System.out.println("Результат деления l на m = " + divLM + ", а остаток от деления  = " + remLM);
        System.out.println("Результат деления m на l = " + divML + ", а остаток от деления  = " + remML);
        System.out.println("Результат деления m на k = " + divMK + ", а остаток от деления  = " + remMK);
        System.out.println(line);

        // task 18
        int apple = 40;
        int student = 6;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println(line);
        // let's change it a bit
        apple = 100;
        student = 21;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");
        System.out.println(line);

        //task 19
//        int sumKLM = k + l + m;
//        sumKLM++;
//        System.out.println("Cумма переменных k, l, m + 1 равна " + sumKLM);
//        System.out.println(k + " + " + l + " + " + m + " + 1 = " + sumKLM);
//        sumKLM--;
//        sumKLM--;
//        System.out.println(k + " + " + l + " + " + m + " - 1 = " + sumKLM);
//        System.out.println("Cумма переменных k, l, m - 1 равна " + sumKLM);
//        System.out.println(line);
//        sumKLM++;
//        m++;
//        System.out.println("(" + k + " + " + l + " + 33) - " + "(33 + 1) = " + (sumKLM - m) );
        // something went wrong

        //task 19 start again
        int sumKLM = k + l + m;
        m++;
        sumKLM--;
        System.out.println("(" + k + " + " + l + " + " + m + ") + " + (k + l + m) + " = " + (k + l + m + sumKLM));
        System.out.println("" + m + " - " + sumKLM + " = " + (m - sumKLM));
        System.out.println(line);

        // task 20
        int rem488 = 48 % 8;
        System.out.println("Число 48 кратно 8, потому что остаток от деления 48/8 = " + rem488);
        int rem482 = 48 % 2;
        int rem82 = 8 % 2;
        System.out.println("Числа 48 и 8 четные, потому что остаток от деления каждого из них на 2 = " + rem82);
        int rem472 = 47 % 2;
        int rem492 = 49 % 2;
        System.out.println("Число 47 нечетное, потому что остаток от деления 47/2 равен " + rem472
        + ", и число 49 тоже нечетное, потому что 49/2 равно " + rem492);
        System.out.println(line);


        // part 3
        double x = 2;
        double y = 3;
        double a = k;
        double b = l;
        double c = m;
        double d = y - x;
        // a. 21,22,23
        System.out.println("21. (x + 3) * (x + 3)");
        System.out.println("22. ((3 + 4*x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x) + ((9 + x) / y))");
        System.out.println("23. (((5*x + 7*y)/(8*x + 10*y)) / ((3*x - y)/(x + y))) " +
                "/ ( a + b + (c/d) + ((a + b)/(c + d)) + a*b)");
        System.out.println(line);
        // b. results
        String space = "                ";
        double result21 = (x + 3) * (x + 3);
        double result22 = ((3 + 4*x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x) + ((9 + x) / y));
        String result22new = String.format("%.5f", result22);
        double i = a + b + (c / d) + ((a + b) / (c + d)) + a * b;
        double result23 = (((5*x + 7*y)/(8*x + 10*y)) / ((3*x - y)/(x + y)))  / i;
        String result23new = String.format("%.5f", result23);

        System.out.println(space);
        System.out.println(line);
        System.out.println("| task    |      result       |");
        System.out.println(line);
        System.out.println("| 21      |       " + result21 + "        |");
        System.out.println("| 22      |    " + result22new + "      |");
        System.out.println("| 23      |     " + result23new + "       |");
        System.out.println("|" + line + "|");












    }
}
