package homework;

import helpers.Utils;

import java.util.Random;

public class HW5 {

    public static String returnDayOfWeek (int x) {
        String day;
        if (x == 1) {
            day = "Monday";
        } else if (x == 2) {
            day = "Tuesday";
        } else if (x == 3) {
            day = "Wednesday";
        } else if (x == 4) {
            day = "Thursday";
        } else if (x == 5) {
            day = "Friday";
        } else if (x == 6) {
            day = "Saturday";
        } else if (x == 7) {
            day = "Sunday";
        } else {
            day = "Error. Enter a number from 1 to 7.";
        }

        return day;
    }

    public static int returnLargestValue(int a, int b, int c) {
        int largest;
        if (a > b) {
            largest = a;
        } else {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static int returnSmallestValue(int a, int b, int c) {
        int smallest;
        if (b < c) {
            if (a < b) {
                smallest = a;
            } else {
                smallest = b;
            }
        } else {
            smallest = c;
        }

        return smallest;
    }

    public static double getAverageTemp (double a, double b, double c, double d, double e) {

        return (a + b + c + d + e) / 5;
    }

    public static String getDollarsCents(double num) {
        int dollars = (int) num;
        double tail = (num - dollars) * 100;
        int cents = (int) tail;

        return dollars + " dollars and " + cents + " cents.";
    }

    public static String getKilogramsGrams(double num) {
        int kilograms = (int) num;
        double tail = (num - kilograms) * 1000;

        return kilograms + " kilograms and " + (int) tail + " grams.";
    }

    public static String getFullPrice (double price, double amount) {
        double fullPrice = price * amount;
        String fullPrice0 = (String.format("%.2f",fullPrice));

        return fullPrice0 + " dollars";
    }

    public static void printReceipt(String item, String measure, double price, double amount) {
        System.out.println(item);
        System.out.println("Price for 1 " + measure + "           " + price + " dollars");
        System.out.println("Amount of the item          " + amount + " " + measure);
        System.out.println("___________________________________________________");
        System.out.println("Price                       " + getFullPrice(price, amount));
    }

    public static double countSalary(double rate, double hoursPerDay, int daysPerMonth) {

        return Math.round(rate * hoursPerDay * daysPerMonth * 100) / 100;
    }

    public static String printSalary(String name, double rate, double hoursPerDay, int daysPerMonth) {

       return name + "                 " + countSalary(rate, hoursPerDay, daysPerMonth)
               + "\n___________________________________________________";
    }

    public static String solveBlocks (int x) {
        String result;
        if (x < 0) {
            result = x + " is negative";
        } else if (x > 0) {
            result = x + " is positive";
        } else {
            result = x + " is zero";
        }

        return result;
    }

    public static int returnLuckyNumber (int yearOfBirth) {
        int sum = yearOfBirth % 10;
        yearOfBirth /= 10;
        sum += (yearOfBirth % 10);
        yearOfBirth /= 10;
        sum += (yearOfBirth % 10);
        yearOfBirth /= 10;
        sum += (yearOfBirth % 10);

        return sum;
    }

    public static void getAverageMedianDiff(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        int median;
        median = sum - returnLargestValue(a,b,c) - returnSmallestValue(a,b,c);
        int difference = average - median;
        if (difference > 2) {
            System.out.println("The difference between average " + average + " and median "
                    + median + " is = " + difference);
        } else {
            System.out.println("The average = " + average + "\n The median = " + median);
        }
    }

    public static void getAverageMedianDiff1(int a, int b, int c) {
        int sum = Math.addExact(a,(Math.addExact(b,c)));
        int average = Math.floorDiv(sum,3);
        int median = (Math.subtractExact(sum, Math.min(a,Math.min(b,c))));
        int difference = Math.subtractExact(average,median);
        if (difference > 2) {
            System.out.println("The difference between average " + average + " and median "
                    + median + " is = " + difference);
        } else {
            System.out.println("The average = " + average + "\n The median = " + median);
        }
    }

    public static String roundDown(double x) {
        x = Math.floor(x);

        return (int) x + " USD " + 0 + " cents";
    }

    public static int getRoundPow(int pow) {
        double result;
        double x = Math.random();
        if (pow >= 0 && pow <= 10) {
            result = Math.round(Math.pow(x, (double) pow));
            System.out.println("Number " + x + " raised to the power of " + pow + " = " + result);
        } else {
            System.out.println("enter a number between 0 and 10");
            result = 0;
        }

        return (int) result;
    }

    public static int getRandom () {
        Random random = new Random();
        int upperbound = 100;
        int num = random.nextInt(upperbound);

        return num;
    }

    public static boolean isLeapYear (int year) {
        boolean isLeapYear = year%4 == 0;

        return isLeapYear;
    }

    public static void main(String[] args) {
        System.out.println(returnDayOfWeek(8));

        System.out.println(getDollarsCents(12.55));

        System.out.println(getKilogramsGrams(20.178));
        System.out.println(getKilogramsGrams(1.003));
        double applesWeight = 1.5;
        double applePrice = 7.99;
        System.out.println(getFullPrice(applePrice, applesWeight));
        printReceipt("Milk", "liter", 4, 2);
        System.out.println(countSalary(25.45,7,27));
        System.out.println(printSalary("Michael Jackson", 509, 10, 18));
        System.out.println(printSalary("Will Smith     ", 1003, 9, 20));
        System.out.println(printSalary("Jessica Alba   ", 899, 11, 21));
        System.out.println(returnLuckyNumber(1986));
        getAverageMedianDiff(3,6,90);
        getAverageMedianDiff1(12,13,11);

        int a  = 3;
        int b = 4;
        int c = 20;
        double result = Math.multiplyExact(a,b);
        result = Math.addExact((int) result,c);
        result = Math.multiplyExact((int) result,((int)Math.pow((double) a, (double) b)));
        result = (int) Math.sqrt(result);
        result = Math.ceil(result / (int)Math.PI);
        System.out.println(result);

        Utils.task(17,1);
        int x,y;
        y = 3;
        if (y > 0) {
            x = 1;
        }

        Utils.task(17,2);
        double score = 89;
        if (score <= 90 && score >= 80) {
            score += 5;
        }
        System.out.println(score);

        Utils.task(17,3);
        boolean item;
        int i = 1;
        int v = 55;
        item = !((i<10) || (v>50));

        Utils.task(17,4);
        x = 17;
        boolean t174 = ((x%2 == 1)&&(x>0));
        System.out.println(t174);

        Utils.task(17,5);
        y = 11;
        boolean t175 = (x>0 && y>0);
        System.out.println(t175);

        Utils.task(17,6);
        boolean t176 = (x*y)>0;
        System.out.println(t176);

        // that was all random, now let's really test!

        Utils.task(2);
        Utils.verifyResults("Monday",returnDayOfWeek(1));
        Utils.verifyResults("Friday",returnDayOfWeek(5));
        Utils.verifyResults("Error. Enter a number from 1 to 7.", returnDayOfWeek(-567));

        Utils.task(3);
        Utils.verifyResults(6,returnLargestValue(2,6,3));
        Utils.verifyResults(1000,returnLargestValue(2,6,1000));
        Utils.verifyResults(106,returnLargestValue(-100,106,3));

        Utils.task(4);
        Utils.verifyResults(-500,returnSmallestValue(-500,11,45));
        Utils.verifyResults(-1045,returnSmallestValue(-500,1177,-1045));
        Utils.verifyResults(9,returnSmallestValue(9,23,45));

        Utils.task(5);
        Utils.verifyResults(37.7,getAverageTemp(36.5,40,38,37.1,36.9));
        Utils.verifyResults(36.9,getAverageTemp(36.5,36,38,37.1,36.9));
        Utils.verifyResults(37.5,getAverageTemp(36.5,40,37,37.1,36.9));


        Utils.task(6);
        Utils.verifyResults("10 dollars and 75 cents.", getDollarsCents(10.75));
        Utils.verifyResults("10 dollars and 75 cents.", getDollarsCents(10.753));
        Utils.verifyResults("100 dollars and 0 cents.", getDollarsCents(100.00));
        System.out.println(getDollarsCents(10.753));

        Utils.task(7);
        Utils.verifyResults("10 kilograms and 75 grams.", getKilogramsGrams(10.075));
        System.out.println(getKilogramsGrams(10.075));
        //?? what to do ??
        Utils.verifyResults("190 kilograms and 250 grams.", getKilogramsGrams(190.250));
        System.out.println(getKilogramsGrams(190.250));

        Utils.task(8);
        /*Написать метод, который принимает на вход 2 параметра -  цену и количество товара
        (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки
        в виде десятичного числа.
         */
        double price = 12;
        double amount = 3.5;
        double exp = price*amount;
        System.out.println(exp);
        Utils.verifyResults(String.format("%.2f",exp) + " dollars",getFullPrice(price,amount));
        System.out.println(getFullPrice(price,amount));

        Utils.task(9);
        /*Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         */
        printReceipt("tomatoes", "kilogram", 6.0,2.4);
        // now how do i verify this?

        Utils.task(10);
        /*Написать метод, который принимает на вход количество часов работы в день
        и стоимость одного часа работы, и возвращает заработную плату в месяц.
         */
        double h = 8; //hours a day
        double r = 28.0; //rate per hour
        y = 20;//days per month
        Utils.verifyResults(28*8*20, countSalary(h, r, y));
        h = 4.5;
        r = 15;
        y = 22;
        Utils.verifyResults(4.5*15*22,countSalary(h,r,y));

        Utils.task(11);
        /*Написать метод, который принимает на вход необходимые параметры и печатает
        строку ведомости выдачи зарплаты сотрудникам.
         */
        String empl = "Mary Smith   ";
        double salary = countSalary(31,6,22);
        Utils.verifyResults("Mary Smith   " + "                 " + salary
                + "\n___________________________________________________", printSalary(empl, 31,6,22));
        System.out.println(printSalary(empl, 31,6,22));

        Utils.task(12);
        // do it later

        Utils.task(13);
        /*Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
        Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
        снова считается сумма всех чисел.
         */
        int yob = 1994;
        int expected = 23;
        Utils.verifyResults(expected,returnLuckyNumber(yob));
        yob = 1986;
        expected = 24;
        Utils.verifyResults(expected,returnLuckyNumber(yob));
        yob = 2015;
        expected = 8;
        Utils.verifyResults(expected,returnLuckyNumber(yob));

        Utils.task(14);
        // I don't have power for this

        Utils.task(15);
        r = 15.85;
        String expect = "15 USD 0 cents";
        Utils.verifyResults(expect,roundDown(r));
        System.out.println(roundDown(r));

        Utils.task(16);
        //maybe later...







    }


}
