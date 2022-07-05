package hw8;

import static helpers.Utils.*;

public class HW8 {

    static Integer anInt = 5;
    static Double aDoub = 20.0;
    static String stg = new String("");

    //task6
    public static void compare (int a, int b, double c, double d, String str1, String str2) {
        String sp = "     ";
        String pp = "|";
        String ln = "---------------------------------------------------------";
        System.out.println(ln);
        System.out.println(sp + "HW8" + sp + sp+ pp + sp  + sp + "HW8_1 " + sp + pp + sp + "Are equal?");
        System.out.println(ln);
        System.out.println("String str1  " + sp+ pp + sp  + "String str " + sp + pp + sp + str1.equals(str2));
        System.out.println(ln);
        System.out.println("Double doub1 " + sp + pp + sp  + "Double doub" + sp + pp + sp + (c == d));
        System.out.println(ln);
        System.out.println("Integer int1 " + sp + pp + sp + "Integer int" + sp + pp + sp + (a == b));
        System.out.println(ln);
    }

    //task7
    public static int[] getArrayOf5(int a, int b, int c, int d, int e) {

        return new int[] {a, b, c, d, e};
    }

    //task8
    public static double[] getArrayOf5(double a, double b, double c, double d, double e) {

        return new double[] {a, b, c, d, e};
    }

    //task9
    public static String[] getArrayOf5(String a, String b, String c, String d, String e) {

        return new String[] {a, b, c, d, e};
    }

    //task10
    public static double[] multiplyArr(int[] arr) {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2.5;
        }

        return newArr;
    }

    //task11
    public static int getNumberOfEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            } else {
                System.out.println("positives only");
                return -1;
            }
        }

        return count;
    }

    //task12
    public static int getNumberOfOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            } else {
                System.out.println("negatives only");
                return -1;
            }
        }

        return count;
    }

    //task13
    public static boolean[] isAbove10 (int[] arr) {
        boolean[] b = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = (arr[i] > 10);
        }

        return b;
    }

    //task14
    public static String getStrFromArr(String[] strings){
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str += strings[i] + " ";
        }

        return str;
    }

    //task15
    public static int getSumOfHalf(int[] arr){
        int sum = 0;
        for (int i = (arr.length / 2); i < arr.length; i++) {
            sum+= arr[i];
        }

        return sum;
    }

    //task16
    public static int[] getProductArr(int value){
        int[] arr = new int[11];
        if (value > 9 || value < 1) {
            System.out.println("unacceptable value: " + value);

            return arr;
        } else {
            for (int i = 0; i < 11; i++) {
                arr[i] = value * i;
            }

            return arr;
        }
    }

    //task17
    public static int[] getOddOrEven(int[] arr) {
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int length;
        if (countEven > countOdd) {
            length = countEven;
        } else if (countEven < countOdd){
            length = countOdd;
        } else {
            length = 0;
        }
        int[] result = new int[length];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (countEven > countOdd && (arr[i] % 2 == 0)){
                result[j] = arr[i];
                j++;
                continue;
            } else {
                result[j] = arr[i];
                j++;
                continue;
            }

        }

        return result;
    }



    //entry point
    public static void main(String[] args) {

        task(6);
        compare(HW8_1.int1, anInt, HW8_1.aDoub1, aDoub, HW8_1.str1, stg);

        task(7);
        verifyResults(new int[] {1,2,3,4,5}, getArrayOf5(1,2,3,4,5));
        verifyResults(new int[] {1,2,3,4,5}, getArrayOf5(1,2,3,4,6));

        task(8);
        verifyResults(new double[]{1.0,2,3,4,5}, getArrayOf5(1.0,2,3,4,5));
        verifyResults(new double[]{1.0,2,3,4,5}, getArrayOf5(1.0,2,3,4,18));

        task(9);
        verifyResults(new String[]{"Roses","are", "red", "violets", "are blue"},
                getArrayOf5("Roses","are", "red", "violets", "are blue"));
        verifyResults(new String[]{"Roses","are", "red", "violets", "are blue"},
                getArrayOf5("Roses","are", "red", "violets", "aren't blue"));

        task(10);
        verifyResults(new double[]{5,10,15,25,100}, multiplyArr(new int[]{2,4,6,10,40}));
        verifyResults(new double[]{5,10,15,25,10}, multiplyArr(new int[]{2,4,6,10,45}));

        task(11);
        verifyResults(2,getNumberOfEven(new int[] {1,2,3,4}));
        line2();
        verifyResults(2,getNumberOfEven(new int[] {1,2,3,4,0}));
        line2();
        verifyResults(-1,getNumberOfEven(new int[] {1,2,3,4,-5}));

        ln();
        task(12);
        verifyResults(2,getNumberOfOdd(new int[] {1,2,3,4}));
        line2();
        verifyResults(2,getNumberOfOdd(new int[] {1,2,3,4,0}));
        line2();
        verifyResults(-1,getNumberOfOdd(new int[] {1,2,3,4,-5}));

        //part2
        ln();
        System.out.println("----------Part 2----------");
        task(13);
        printElements(isAbove10(new int[] {12,1,22,2,33,3}));
        printElements(isAbove10(new int[] {12,11,22,23,33,3}));

        task(14);
        System.out.println(getStrFromArr(new String[]{"hello", "world"}));

        task(15);
        verifyResults(15, getSumOfHalf(new int[]{11,22,33,44,55,1,2,3,4,5}));
        verifyResults(16, getSumOfHalf(new int[]{11,22,33,44,55,1,2,3,4,5,1}));

        task(16);
        printElements(getProductArr(2));
        printElements(getProductArr(12));

        task(17);
        int[] testArr = (getOddOrEven(new int[]{1,2,3,4,5,6,7}));
        printElements(testArr);
        printElements(getOddOrEven(new int[]{1,2,3,4,5,6}));
        printElements(getOddOrEven(new int[]{1,2,3,4,5,6,7,8,10,12}));









    }
}
