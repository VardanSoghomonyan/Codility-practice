package codility_tasks;

import java.util.Arrays;

public class Task1 {

    static int[] Array = {3, 8, 9, 7, 6};
    static int a = 1;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(Array, a)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] newArr = new int[arr.length];

        if (arr.length == 0) return arr;
        k = k % arr.length;
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[(i + (arr.length - k)) % (arr.length)];

        }

        return newArr;
    }

}