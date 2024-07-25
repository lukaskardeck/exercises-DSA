package exercise3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static int[] uniao(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) throw new IllegalArgumentException("O array está nulo");

        Set<Integer> setUniao = new HashSet<>();
        for (int n1 : arr1) { setUniao.add(n1); }
        for (int n2 : arr2) { setUniao.add(n2); }

        int[] arrUniao = new int[setUniao.size()];

        int count = 0;
        for (int num : setUniao) {
            arrUniao[count++] = num;
        }

        return arrUniao;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 13, 45, 7};
        int[] arr2 = {24, 4, 16, 81, 10, 12};
        System.out.println(Arrays.toString(uniao(arr1, arr2)));
        System.out.println("Hello, world!");

    }
}
