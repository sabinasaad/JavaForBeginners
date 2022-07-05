package homework;

import helpers.Utils;

public class HW4 {

    public static void calcKLM (String text1, String text2, int result1, int result2) {
        System.out.println("Результат деления " + text1 + " на " + text2 + " = " + result1 + ", а остаток от деления  = "
                + result2);
    }

    public static void giveApples(int apples, int students, int appleStud, int appleTeach){
        System.out.println("Если " + apples + " яблок(а) поделить на " + students + " учеников, то каждый ученик получит по "
                + appleStud + " яблок(а), и " + appleTeach + " яблок(а) останется учителю.");
    }

    public static void giveApples1(int apples, int students, int appleStud, int appleTeach, String text1, String text2,
                                    String text3){
        appleStud = apples/students;
        appleTeach = apples%students;
        if ((apples%10) == 1) {
            text1 = " яблоко";
        } else if ((apples%10) <= 4 && (apples%10) >= 2) {
            text2 = " яблока";
        } else {
            text3 = " яблок";
        }
        if ((appleStud%10) == 1) {
            text1 = " яблоко";
        } else if ((appleStud%10) <= 4 && (appleStud%10) >= 2) {
            text2 = " яблока";
        } else {
            text3 = " яблок";
        }
        if ((appleTeach%10) == 1) {
            text1 = " яблоко";
        } else if ((appleTeach%10) <= 4 && (appleTeach%10) >= 2) {
            text2 = " яблока";
        } else {
            text3 = " яблок";
        }

        System.out.println("Если " + apples + text1 + " поделить на " + students + " учеников, то каждый ученик получит по "
                + appleStud + text2 + " и " + appleTeach + text3 + " останется учителю.");
    }

    public static void assertIntegerResult (int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void assertStringResult (String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }







    public static void main(String[] args) {



        Utils.task(3,1); //1) (2 = 2) И (7 = 7);

//        int a = 2;
//        int b = 7;
//        (a == a) && (b == b);

        Utils.task(3,2);// 2) Не(15 < 3)
//        a = 15;
//        b = 3;
//        !(a < 3);
        Utils.task(3,3); //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
//        String pine = "Pine";
//        String oak = "Oak";
//        String cherry = "Cherry";
//        String maple = "Maple";
//        (pine == oak)||(cherry == maple);
        Utils.task(3,4); //4) Не("Сосна" = "Дуб");
//        !(pine = oak);
        Utils.task(3,5); //5) (Не(15 < 3)) И (10 > 20);
//        int c = 10;
//        int d = 20;
//        (!(a < b)) && (c>20);
        Utils.task(3,6); // 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
//        String eyes = "Eyes are given to see";
//        String floor = "There's second floor under third floor";
//        eyes && floor;
        Utils.task(3,7); //7) (6/2 = 3) ИЛИ (7*5 = 20).
//        c = 3;
//        d = 20;
//        (6/2 = c) || (7 * 5 = d);

        Utils.task(4,1); // 1) ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
//        int second = 1;
//        int minute = 60;
//        String time = "A working clock shows time";
//        (minute == second * 70) || time;
        Utils.task(4,2); //2) !(28 > 7) И !(300/5 = 60);
//        a = 28;
//        b = 7;
//        c = 300 / 5;
//        d = 60;
//        !(a > b) && !(c = d);
        Utils.task(4,3); // 3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
//        String tv = "television";
//        String elAp = "electrical appliance";
//        String gl = "glass";
//        String wood = "wood";
//        (tv = elAp) && (gl = wood);
        Utils.task(4,4); // 4) Не((300 < 100))  → ("Жажду можно утолить водой");
        int aa = 300;
        int bb = 100;
        String thirst = "Жажду можно утолить водой";
        if (!(aa<bb)) {
            System.out.println(thirst);
        }

        Utils.task(4,5); // 5) (75 < 81) → (88 = 88)
        aa = 75;
        bb = 81;
        int cc = 88;
        int dd;
        if (aa < bb) {
            dd = cc;
            System.out.println(dd);
        }

        Utils.task(5, "a");
        // а) Андрей старше Светы. Наташа старше Светы.
        int andrey = 34;
        int sveta = 25;
        int natasha = 30;
        if ((andrey > sveta) && (natasha > sveta)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Utils.task(5, "b");
        // б) На полке стоят учебники, а на столе лежат справочники.
        String place = "shelf";
        String item;
        if (place == "shelf") {
            item = "textbook";
            System.out.println(item);
        }
        if (place == "desk") {
            item = "reference book";
            System.out.println(item);
        }

        Utils.task(5,"c"); // в) БОльшая часть детей — девочки. Остальные - мальчики.
//        int girls;
//        int boys;
//        int kids = girls + boys;
//        girls > boys;

        Utils.task(6); // “Водительские права можно получить, только когда исполнится 16 лет.”
        int age;
        age  = 12;
        if (age >= 16) {
            System.out.println("You can get driving licence");
        } else {
            System.out.println("You have to wait until you turn 16");
        }

        Utils.task(7); //”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
       // (!("Pete rides a bus"))&&(("Pete reads a book") || !("Pete looks in the window"))

        Utils.task(8); //“Если с другом ты, это хорошо, а когда наоборот - плохо”
        String youAre = "with a friend";
        String itIs;
        if (youAre == "with a friend") {
            itIs = "good";
            System.out.println(itIs);
        } else {
            itIs = "bad";
            System.out.println(itIs);
        }

        Utils.task(9); //Записать выражения в виде условий if-else:
        //- Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        age = 33;
        if (age > 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a child");
        }
        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String land = "dry";
        String weather;
        if (land == "dry") {
            weather = "no rain";
        } else if (land == "wet") {
            weather = "rain";
        }
        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        land = "whatever";
        if (land == "dry") {
            weather = "no rain";
        } else if (land == "wet") {
            weather = "rain";
        } else {
            weather = "snow";
        }
        System.out.println(weather);
        //Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String sky = "clouds";
        if (sky == "clouds") {
            weather = "rain";
            System.out.println(weather);
        } else {
            weather = "'blind' rain";
            System.out.println(weather);
        }
        //Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
        // Иначе вчера был не четверг, а завтра - не воскресенье
        String today = "Saturday";
        String tomorrow;
        String yesterday;
        yesterday = "day";
        if (today == "Saturday") {
            tomorrow = "Sunday";
        }

        if (today == "Friday") {
            yesterday = "Thursday";
        } else {
            yesterday = "not Thursday";
            tomorrow = "not Saturday";
        }
        // Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
        String mountainCrab = "has whistled";
        String eternity;
        if (mountainCrab == "has whistled") {
            eternity = "has passed";
        } else {
            eternity = "keep waiting";
        }
        //Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        age = 18;
        int school = 1; // 1 - have graduated, 0 - haven't graduated
        if (age >= 18 && school == 1) {
            System.out.println("you can live separately");
        } else {
            System.out.println("live with your parents");
        }

        // part 2
        Utils.task(10);//Проверьте число на четность. Если число четное, удвойте это число, иначе возведите
        // число в квадрат.
        //        Выведите результат работы алгоритма на печать.
        //        Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        int num10;
        num10 = 5;
        if ((num10 % 2) == 0) {
            num10 = num10 * 2;
        } else {
            num10 = num10 * num10;
        }
        System.out.println(num10);
        // slides 13, 14
        assertIntegerResult(25, num10);

        Utils.task(11); /** Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         Голосовать можно с 18 лет
         Машину можно водить с 16 лет
         В школу можно идти с 5 лет
         Выведите результат работы алгоритма на печать.

         Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */
        String youCan;
        age = 21;
        Utils.task(11,"a");
        if (age >= 18) {
            youCan = "you can vote";
        } else {
            youCan = "you cannot vote";
        }
        Utils.task(11, "b");
        if (age >= 16) {
            youCan += ", you can drive";
        } else {
            youCan += ", you cannot drive";
        }
        Utils.task(11, "c");
        if (age >= 5) {
            youCan += ", you can go to school";
        } else {
            youCan += ", you cannot go to school";
        }
        System.out.println(youCan);
        assertStringResult("you can vote, you can drive, you can go to school",youCan);
        // slide 15, sequential conditions

        /**Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         5 - выдать похвальную грамоту и перевести в следующий класс
         4 - перевести в следующий класс
         3 - дать задание на лето и перевести в следующий класс
         2 - вызвать родителей и оставить в текущем классе на второй год
         Выведите результат работы алгоритма на печать.
        */
        Utils.task(12);
        int mark;
        mark = 6;
        int year = 1;
        if (mark == 5) {
            year = year + 1;
            System.out.println("Great job! Here is your award :) You will start year " + year + " in September");
        } else if (mark == 4) {
            year = year + 1;
            System.out.println("You will start year " + year + " in September");
        } else if (mark == 3) {
            year += year;
            System.out.println("You should complete these tasks over summer break. You will start year " + year + " in September");
        } else if (mark == 2) {
            System.out.println("You will have to repeat year" + year + "again");
        } else {
            System.out.println("enter a correct1 mark");
        } // slide 15

        Utils.task(13);
        /** Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает
         числа, которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
         Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число
         отрицательное, программа умножает результат предыдущего действия на (-1).
         Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
        */
        int x = 5;
        int y = 15;
        int resXY;
        if ((x % 3) == 0 && (y % 3) == 0) {
            resXY = x + y;
            if (resXY < 0) {
                resXY = resXY * -1;
                System.out.println(resXY);
            }
        } else if ((x % 5) == 0 && (y % 5) == 0) {
            resXY = x - y;
            if (resXY < 0) {
                resXY = resXY * -1;
                System.out.println(resXY);
            }
        } else if ((x % 2) == 0 && (y % 2) == 0) {
            resXY = x * y;
            if (resXY < 0) {
                resXY = resXY * -1;
                System.out.println(resXY);
            }
        } else {
            System.out.println("Error. Calculation impossible with these values. Enter correct1 values & try again");
        }

        Utils.task(14);
        /** Распечатать следующие выражения, используя метод и параметры:
         Результат деления k на l = …, а остаток от деления  = …
         Результат деления k на m = …, а остаток от деления  = …
         Результат деления l на m = …, а остаток от деления  = …
         Результат деления m на k = …, а остаток от деления  = …
         И так далее все возможные варианты.
         Сравнить код из HW2 с кодом из HW4. Что для вас легче? */
        int k = 110;
        int l = 25;
        int m = 3;
        calcKLM("k", "l",k/l, k%l);
        calcKLM("k", "m",k/m,k%m);
        calcKLM("l","m",l/m,l%m);
        calcKLM("m","k",m/k,m%k);
        calcKLM("l","k",l/k,l%k);
        calcKLM("m","l",m/l,m%l);
        // вы методов продаете?
        // нет, только показываем.
        // красивое.

        Utils.task(15);
        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         *
         * а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */
        int apple = 40;
        int student = 6;
        giveApples(apple,student,apple/student, apple%student);
        apple = 100;
        student = 21;
        giveApples(apple,student,apple/student,apple%student);

        Utils.task(16);
        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         *
         *
         * Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически
         * в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */
       //kill me please
        //giveApples1(42,42, );










         }






}
