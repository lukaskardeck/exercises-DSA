package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static int[] valores_entre(int[] arr, int min, int max) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("O array está vazio ou é nulo!");

        ArrayList<Integer> arrayFinal = new ArrayList<>();
        for (int n : arr) {
            if (n >= min && n <= max) arrayFinal.add(n);
        }

        if (arrayFinal.isEmpty()) throw new RuntimeException("Não há nenhum valor existe entre o mínimo e o máximo");

        return arrayFinal.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 16, 32, 5};
        System.out.println(Arrays.toString(valores_entre(arr, 32, 16)));
    }
}
