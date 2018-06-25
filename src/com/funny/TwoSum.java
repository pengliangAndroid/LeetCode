package com.funny;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] result = new TwoSum().twoSum(new int[]{1, 4, 8, 12}, 9);
        System.out.println(result[0] + "," + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subVal = target - nums[i];

            if(map.containsKey(subVal)){
                return new int[]{map.get(subVal),i};
            }

            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("no two num solution");
    }

}
