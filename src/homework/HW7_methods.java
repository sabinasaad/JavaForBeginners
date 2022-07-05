package homework;

public class HW7_methods {
    public static int getAverageInt(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    //task 21
    public static int[] getMinMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i] ;
        }
        average = sum / array.length;

        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = average;
        return result;
    }
}
