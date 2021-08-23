package ru.job4j.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Turn {
    public static int[] back(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }

}
