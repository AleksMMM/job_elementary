package ru.job4j.array;

import java.util.Arrays;

public class FindLoop {

    public static int indexOff(int [] data, int el ) {
        int rst = -1;

        for (int i = 0; i < data.length;i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;

    }

}
