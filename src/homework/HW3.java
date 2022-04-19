package homework;

import static java.lang.Double.sum;

public class HW3 {

    public static void main(String[] args) {

        String task = "Task # ";
        byte taskNum;
        String line = "--------------------------------------------------------";

        // task # 2
        //Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона
        byte a = 3;
        byte b = 55;

        // task # 3
        // Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000
        short s = 30000;
        short t = -30000;

        // task # 4
        // Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
        // Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
        int i = -2147483648;
        i = 2147483647;
        taskNum = 4;
        System.out.println(task + taskNum);
        System.out.println(line);
        System.out.println("|   int min |   " + Integer.MIN_VALUE + "   |");
        System.out.println(line);
        System.out.println("|   int max |   " + Integer.MAX_VALUE + "    |");
        System.out.println(line);

        // task 5
        // Создать переменную phoneNumber и присвоить ей значение номера телефона
        // с кодом страны и города (можно ненастоящий номер телефона, например, 18009998877)
        taskNum++;
        long phoneNumber = 966540012855L;

        // task 6
        // Создать переменную f типа float и присвоить ей значение 100.101101.
        // Создать переменную d типа double и присвоить ей значение 100.101101.
        //Распечатать результат в виде таблицы
        taskNum++;
        float f = 100.101101F;
        double d = 100.101101;
        System.out.println(line + "\n" + task + taskNum);
        System.out.println(line);
        System.out.println("|   float f     |   " + f + "   |");
        System.out.println(line);
        System.out.println("|   double d    |   " + d + "   |");
        System.out.println(line);

        // task 7
        // a) Создать переменную типа Double с именем dd
        // и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        taskNum++;
        Double dd = sum(10.09999, 20.099999);

        // b) Создать переменную типа Float с именем ff
        // и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
        Float ff = Float.sum(10.09999F, 20.099999F);
        String ffF = String.format("%.5f",ff);
        String ddD = String.format("%.5f", dd);

        System.out.println("|   " + task + taskNum);
        System.out.println(line);
        System.out.println("|   Double dd   |   " + ddD + "     |");
        System.out.println(line);
        System.out.println("|   Float ff    |   " + ffF + "     |");

        // task 8
        // Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
        taskNum++;
        double result = 10.0 / 3.0;
        System.out.println(line + "\n" + task + taskNum);
        System.out.println(result);

        // task 9
        //Создать переменные sum, product, quotient и remainder, и  присвоить им значения вычислений переменных f и d
        taskNum++;
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        // task 10
        // Распечатать слово HELLO точками
        taskNum++;
        System.out.println(line + "\n" + task + taskNum + "\n" + line);
        System.out.println(".        .   ..........  .           .           ..........");
        System.out.println(".        .   .           .           .           .        .");
        System.out.println(".        .   .           .           .           .        .");
        System.out.println("..........   ..........  .           .           .        .");
        System.out.println(".        .   .           .           .           .        .");
        System.out.println(".        .   .           .           .           .        .");
        System.out.println(".        .   ........... ..........  ..........  ..........");

        //task 11
        //Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
        //t1 = 0;
        //t2 = 150;
        //t3 = -120;
        //t4 = - 505.505;
        //t5 = 100100;
        //t6 = 100010001000;
        //t7 = 2.66666666666666;
        //t8 = - 1000000.001;
        //t9 = 1010;
        //
        //Распечатать значения всех переменных.
        taskNum++;
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = - 1000000.001F;
        Short t9 = 1010;
        System.out.println(line + "\n" + task + taskNum);
        System.out.println(line);
        String pipeSp = "|   ";
        String spPipe = "    |";
        String spPipeSp = "   |   ";

        System.out.println(pipeSp + "Byte t1     " + spPipeSp + t1 + "                " + spPipe);
        System.out.println(pipeSp + "Short t2    " + spPipeSp + t2 + "              " + spPipe);
        System.out.println(pipeSp + "Byte t3     " + spPipeSp + t3 + "             " + spPipe);
        System.out.println(pipeSp + "Float t4    " + spPipeSp + t4 + "         " + spPipe);
        System.out.println(pipeSp + "Integer t5  " + spPipeSp + t5 + "           " + spPipe);
        System.out.println(pipeSp + "Long t6     " + spPipeSp + t6 + "     " + spPipe);
        System.out.println(pipeSp + "Double t7   " + spPipeSp + t7 + " " + spPipe);
        System.out.println(pipeSp + "Float t8    " + spPipeSp + t8 + "       " + spPipe);
        System.out.println(pipeSp + "Short t9    " + spPipeSp + t9 + "             " + spPipe);

        System.out.println(line);

        // task 12
        // С помощью полей классов ссылочного типа распечатать таблицу
        taskNum++;
        System.out.println(line + line + "\n" + task + taskNum + "\n" + line + line);
        System.out.println(pipeSp + "Type      " + "| Size in bits   |" + "          min          " + spPipeSp
                + "         max          " + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "byte   " + spPipeSp + "    " + Byte.SIZE + "     " + spPipeSp + "       "
                +  Byte.MIN_VALUE + "         " + spPipeSp + "          " + Byte.MAX_VALUE + "         " + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "short  " + spPipeSp + "    " + Short.SIZE + "    " + spPipeSp + "    "
                + Short.MIN_VALUE + "          " + spPipeSp + "         " + Short.MAX_VALUE + "        " + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "int    " + spPipeSp + "    " + Integer.SIZE + "    " + spPipeSp
                + "    " + Integer.MIN_VALUE + "     " + spPipeSp + "      " + Integer.MAX_VALUE + "      " + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "long   " + spPipeSp + "    " + Long.SIZE + "    " + spPipeSp
                + Long.MIN_VALUE + spPipeSp + "   " + Long.MAX_VALUE + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "float  " + spPipeSp + "    " +  Float.SIZE + "    " + spPipeSp
                + "       " + Float.MIN_VALUE + "      " + spPipeSp + "    " + Float.MAX_VALUE + "      " + spPipe);
        System.out.println(line + line);
        System.out.println(pipeSp + "double " + spPipeSp + "    " + Double.SIZE + "    " + spPipeSp
                + "       " + Double.MIN_VALUE + "     " + spPipeSp + Double.MAX_VALUE + spPipe);
        System.out.println(line + line);

        /**task 13
        Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде
         выражения: “Если num1 = num2, то результат сравнения методом .equal = …”
         Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        Integer num1 = 18;
        Integer num2 = 18;
        num1.equals(num2);
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        num2 = 21;
        System.out.println("Если num1 != num2, то результат сравнения методом .equal = " + num1.equals(num2));

        /** task 14
         * Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        int number1;
        int number2;
        number1 = 44;
        number2 = 44;
        Integer.compare(number1,number2);
        System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                + Integer.compare(number1,number2));
        number1 = 16;
        System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                + Integer.compare(number1,number2));
        number2 = 3;
        System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                + Integer.compare(number1,number2));

        /** task 15
         * Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        Float t15 = 234.9999F;
        System.out.println(t15.intValue());
        System.out.println(Math.round(t15));

        /** task 16
         *С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        double d1 = 4367.11;
        double d2 = 988.000002;
        System.out.println(sum(d1,d2));

        /** task 17
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        Float f1 = 12.001F;
        Float f2 = 122287.099F;
        Integer sumf1f2 = Integer.sum(f1.intValue(), f2.intValue());
        System.out.println(sumf1f2);

        /** task 18
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        Short short1 = 12000;
        Short short2 = 12300;
        /**
         * Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         */
        int diff12 = Short.compare(short1,short2);
        System.out.println(short1 + " - " + short2 + " = " + diff12);

         /**
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */
         short1 = 12500;
         diff12 = Short.compare(short1,short2);
         System.out.println(short1 + " - " + short2 + " = " + diff12);

        /** task 19 */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        /**
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         */
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        /**
        * Распечатать результат doub1 - doub2
        *
        * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
        */
        double diffD12 = (Double.compare(doub1,doub2));
        System.out.println(diffD12);
        // hmmmmmmmmmm.... okay..
        double diffStr12;
        double str11 = Double.parseDouble(str1);
        double str22 = Double.parseDouble(str2);
        diffStr12 = Double.compare(str11, str22);
        System.out.println(diffStr12);
        // need to check

        /** task 20
         * Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
         * (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем
         * минимальное значение. Посчитать и распечатать среднее значение, округленное с помощью метода класса
         * Math. Распечатать результат среднего значения температуры тела кота.
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        double catTemp;
        catTemp = 38.1F;
        catTemp = 39.2F;
        double catAv = (38.1F + 39.2F) / 2;
        double avCatTemp = Math.round(catAv);
        System.out.println(avCatTemp);
        // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA


        /** task 21
         * Создать переменную n типа Number, присвоить ей максимально возможное значение.
         * Присвоить n значение 10,
         * затем присвоить n значение 10.999999999.
         *
         * Распечатать результаты в виде выражения:
         * “Переменная n может принимать значения:
         *  n =  …
         *  n =  …
         *  n =  …
         *  Это возможно, потому что …”
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);

        Number n = Double.MAX_VALUE;
        n = 10;
        n = 10.999999999;
        System.out.println("Переменная n может принимать значения: \n" +
                " n = " + Double.MAX_VALUE + "\n" +
                " n =  " + 10 + "\n" +
                " n =  " + n + "\n" +
                " Это возможно, потому что диапазон значений double может включать от " + Double.MIN_VALUE
                + " до " + Double.MAX_VALUE);

        /** task 22
         *
         */
        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        /**
         * Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */
        Integer numberInteger = 100;
        System.out.println(numberInteger.getClass());

        taskNum++;
        System.out.println(line + "\n" + task + taskNum);
        /**
         * Вывести на экран следующие выражения, используя для печати только переменные:
         * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту
         * должно быть вычислено по формуле
         * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */
        String celsD = " градусов по Цельсию  ";
        String farD = " градусов по Фаренгейту";
        String eq = " = ";
        double bodyTempC = 36.6;
        double bodyTempF = bodyTempC * 1.8 + 32;

        System.out.println(bodyTempC + celsD + eq + bodyTempF + farD);

        String kgs = " kilograms ";
        String lbs = " pounds ";
        String comma = ", ";
        double kgWeight1 = 50.0;
        double lbWeight1 = kgWeight1 * 2.2;
        double lbWeight2 = 50;
        double kgWeight2 = lbWeight2 / 2.2;
        System.out.println(kgWeight1 + kgs + eq + lbWeight1 + lbs + comma + lbWeight2 + lbs + eq + kgWeight2 + kgs);



    }
}
