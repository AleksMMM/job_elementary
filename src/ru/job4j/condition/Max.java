package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int three) {
        int result = max(left, right) > three ? max(left, right) : three;
        return result;
    }

    public static int max(int left, int right, int three, int four) {
        int result = max(left, right, three) > four ? max(left, right, three) : four;
        return result;
    }

}
