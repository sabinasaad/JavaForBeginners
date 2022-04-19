package homework;

public class HW7 {

    public static void main(String[] args) {

        HW4.task(1);
        String[] catsNames = new String[8];

        catsNames[0] = "Мурзик";
        catsNames[1] = "Чернышка";
        catsNames[2] = "Мурка";
        catsNames[3] = "Васька";
        catsNames[4] = "Рыжикуш";
        catsNames[5] = "Дымка";
        catsNames[6] = "Патрик";
        catsNames[7] = "Зорро";

        HW4.task(2);
        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        HW4.task(3);
        String[] catsColors = new String[8];

        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Red";
        catsColors[5] = "Grey";
        catsColors[6] = "Red";
        catsColors[7] = "Grey";

        HW4.task(4);
        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};

        HW4.task(5);
        boolean[] isCatRed = new boolean[8];

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Red")) {
                isCatRed[i] = true;
            } else {
                isCatRed[i] = false;
            }
            System.out.println(isCatRed[i]);
        }

        HW4.subTask(6, 1);
        System.out.println(catsNames[6]);

        HW4.subTask(6, 2);
        for (int i = 0; i < catsNames.length; i += 2) {
            System.out.println(catsNames[i]);
        }

        HW4.subTask(6, 3);
        for (int i = 0; i < catsNames.length; i += 4) {
            System.out.println(catsNames[i]);
        }

        HW4.subTask(6, 4);
        for (int i = 1; i < catsNames.length; i += 2) {
            System.out.println(catsNames[i]);
        }

        HW4.subTask(6, 5);
        for (int i = 0; i < catsNames.length; i += 3) {
            System.out.println(catsNames[i]);
        }

        HW4.task(7);
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Feed the cat in the box " + i);
            }
        }

        HW4.task(8);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Take the cat in the box " + i + " for a vaccine shot");
            }
        }

        HW4.task(9);
        System.out.println(catsNames[7] + ", " + catsColors[7] + ", " + catsAges[7]);

        HW4.task(10);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) { // only greater than 2, as per instructions
                System.out.println(catsNames[i]);
            }
        }

        HW4.task(11);
        for (int i = 0; i < catsAges.length; i++) {
            if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                System.out.println("Feed the cat in the box " + i);
            }
        }


        //part 2
        System.out.println("\npart 2");
        HW4.task(12);
        int sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        int average = sum / catsAges.length;
        System.out.println(average);

        HW4.task(13);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        HW4.task(14);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

        HW4.task(15);
        int count = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                count++;
            }
        }
        System.out.println(count);

        HW4.task(16);
        for (int i = 0; i < catsNames.length; i += 2) {
            if (catsAges[i] <= 3) {
                System.out.println(catsNames[i]);
            }
        }

        HW4.task(17);
        int[] task17 = new int[5];

        for (int i = 0, j = 0; j < task17.length; i += 2, j++) {

            if (i % 2 == 0 && i < 10) {
                task17[j] = i;
            }
        }
        for (int i = 0; i < task17.length; i++) {
            System.out.println(task17[i]);
        }

        HW4.task(18);

        System.out.println(HW7_methods.getAverageInt(catsAges));
        HW5.verifyResults(2, HW7_methods.getAverageInt(new int[]{1, 2, 3}));

        HW4.task(19);
        int[] negativeNumbers = new int[20];
        for (int i = -901, j = 0; j < negativeNumbers.length; i -= 2, j++) {
            negativeNumbers[j] = i;
        }
        for (int i = 0; i < negativeNumbers.length; i++) {
            System.out.print(negativeNumbers[i] + ", ");
        }
        System.out.println();

        HW4.task(20);
        int[] randomPositive = new int[10];
        for (int i = 0; i < randomPositive.length; i++) {
            randomPositive[i] = (int) (Math.random() * 100);
            System.out.println(randomPositive[i]);
        }

        HW4.task(21);
        int[] test = HW7_methods.getMinMaxAverage(randomPositive);
        int[] test2 = HW7_methods.getMinMaxAverage(task17);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < test2.length; i++) {
            System.out.print(test2[i] + " ");
        }
        System.out.println();
        int[] test3 = HW7_methods.getMinMaxAverage(catsAges);
        for (int i = 0; i < test3.length; i++) {
            System.out.print(test3[i] + " ");
        }
        System.out.println();


        HW4.task(22);
        int[] even20 = new int[5];
        int[] odd20 = new int[5];
        for (int i = 0, j = 0; i < even20.length; i++) {
            if (randomPositive[i] % 2 == 0) {
                even20[j] = randomPositive[i];
                ++j;
            }
            System.out.println(Integer.toString(even20[i]));

        }
        // ok, too tired to see the error....


        HW4.task(23);

    }


}

