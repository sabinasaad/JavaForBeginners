package lessons;

import java.util.ArrayList;
import java.util.List;

public class Lesson13Lists {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        System.out.println(strList);
        strList.add(0,"b");
        System.out.println(strList);

        strList.remove("b");
        System.out.println(strList);

        List<Integer> integerList = List.of(1,2,3,4,5);

        System.out.println(integerList);
        System.out.println(integerList.size());

        System.out.println(integerList.isEmpty());

    }
}
