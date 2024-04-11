package com.example.test.p36_permutations_combinations;



import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private  void backtrack(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (currentPermutation.contains(nums[i])) {
                continue; // Skip already used elements
            }

            currentPermutation.add(nums[i]);
            backtrack(nums, currentPermutation, result);
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5};
        Permutations permutationsObj1=new Permutations();
        List<List<Integer>> permutations = permutationsObj1.permute(nums);

        System.out.println("All Permutations:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
