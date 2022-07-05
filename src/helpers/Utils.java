package helpers;

import java.util.Arrays;
import java.util.Objects;

public class Utils {

    static String lineS = "----------";

    public static void ln() {
        System.out.println();
    }

    public static void line () {
        System.out.println("----------");
    }

    public static void line2() {
        System.out.println("---------------------------------------");
    }
    public static void task(int num) {

        System.out.println(lineS + "Task " + num +  lineS);
    }

    public static void task(int num, int subnum) {

        System.out.println(lineS + "Task " + num + ", " + subnum + lineS);


    }

    public static void task(int num, String text) {

        System.out.println(lineS + "Task " + num + ", " + text + lineS);


    }

    public static void verifyResults(int expected, int actual) {
        if (expected == actual) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void verifyResults(String expected, String actual) {
        if (Objects.equals(expected, actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void verifyResults(double expected, double actual) {
        if (expected == actual) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void verifyResults(int[] expected, int [] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void verifyResults(double[] expected, double [] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    public static void verifyResults(String[] expected, String [] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }


    public static void printElements(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printElements(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printElements(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
