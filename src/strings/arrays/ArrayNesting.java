package strings.arrays;

import java.util.Arrays;

public class ArrayNesting {

    private static int[] a;

    public int arrayNesting(int[] nums) {
        int maxDepth = 1;
        int[] a = new int[nums.length];
        Arrays.fill(a, -1);

        for (int i = 0; i < nums.length; i++) {
            maxDepth = Math.max(maxDepth, getPath(nums, i));
        }

        return maxDepth;

    }

    private int getPath(int[] nums, int i) {
        System.out.println(a);
        if (a[i] != -1) return a[i];
        if (i == nums[i]) return 0;

        a[i] = getPath(nums, nums[i]) + 1;

        return a[i];
    }
}
