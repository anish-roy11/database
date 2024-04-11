package com.example.test.p36_permutations_combinations;



import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public  List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private  void backtrack(int n, int k, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (currentCombination.size() == k) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            backtrack(n, k, i + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        Combinations combinationsObj1 = new Combinations();
        List<List<Integer>> combinations = combinationsObj1.combine(n, k);

        System.out.println("All Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
