package codility_tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Solution {
//    static int[] array = {2, 4, 3, 1, -100, -2, 400, -524, 10000};

    public static void main(String[] args) {
        solution(4);
    }


    public static int[] solution(int N) {
        ArrayList<Integer> setArray = new ArrayList<>(N);
        int sum = 0;
        int x = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j <= N; j++) {

                x = new Random().nextInt();
                if (!setArray.contains(x)) {
                    setArray.add(x);
                    System.out.println(setArray.get(i));
                    break;
                }
            }

            sum += x;
        }
        int last = -sum;
        setArray.add(last);
        int[] newArray = setArray.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}

//        array[N - 1] = -sum;
//        return array;


//        ArrayList<Integer> newArray = new ArrayList<>();
//            for (int i = 0; i < A.length; i++) {
//                if (A[i] % 4 == 0) {
//                    newArray.add(A[i]);
//                }
//            }
//        return Collections.min(newArray);
//    }
//    public static int solution(int[] A) {
//        int N = A.length;
//        int number = 0;
//        Set<Integer> set = new HashSet<>();
//        for (int a : A) {
//            if (a > 0) {
//                set.add(a);
//            }
//        }
//        if (set.isEmpty()) {
//            number = 1;
//        } else {
//            for (int i = 1; i <= N + 1; i++) {
//                if (!set.contains(i)) {
//                    number = i;
//                    break;
//                }
//            }
//        }
//        return number;
//    }
//
//    public static int solution1(int[] A) {
//        int actual = ((A.length + 1) * (A.length + 2)) / 2;
//        int sum = 0;
//        for (int a : A) {
//            sum += a;
//        }
//        return actual - sum;
//    }
//}