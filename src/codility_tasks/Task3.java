package codility_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
//        int [] arr = new int [5];
        Set<Integer> set = new HashSet<>(10);
        ArrayList<Integer> setArray = new ArrayList<>(10);
        set.add(3);
//        int [] array1 = set.toArray(new int[][]{new int[set.size()]});
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(setArray.size());

    }
}
