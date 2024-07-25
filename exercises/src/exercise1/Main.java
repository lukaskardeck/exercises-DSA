package exercise1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int totalPares(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int n : arr) {
            if (n % 2 == 0) total++;
        }
        return total;
    }

    public static int maiorValor(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array não pode ser nulo ou vazio");
        int maior = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) maior = arr[i];
        }

        return maior;
    }

    public static int totalIguais(int[] arr1, int[] arr2) {
        // Se algum dos arrays estiverem vazios, não haverá interseção entre eles.
        if (arr1.length <= 0 || arr2.length <= 0) return 0;

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Todos os elementos de cada array são passados para as estruturas que implementam o 'Set', pois assim eliminam-se as duplicatas.
        for (int n1 : arr1) set1.add(n1); // O(n)
        for (int n2 : arr2) set2.add(n2); // O(n)

        // O método retainAll() irá fazer a interseção entre set1 e set2. Manterá em set1 os elementos que também estão presentes em set2.
        set1.retainAll(set2); // O(n) - usa Hash para realizar a interseção

        return set1.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {22, 2, 4, 1, 10};
        int[] arr2 = {1, 2, 7, 0, 10};

        System.out.println(totalPares(arr1));
        System.out.println(totalIguais(arr1, arr2));
        System.out.println(maiorValor(arr1));
    }
}
