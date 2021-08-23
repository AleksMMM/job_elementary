package ru.job4j.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Turn {
    public static int[] back(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = tmp;
        }
        return nums;
    }

}
