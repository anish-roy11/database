package com.example.test.p37_subsets;


import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack(nums, i + 1, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Subsets subsetsObj1=new Subsets();
        List<List<Integer>> subsets = subsetsObj1.generateSubsets(nums);

        System.out.println("All Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
