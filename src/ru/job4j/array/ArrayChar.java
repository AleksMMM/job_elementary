package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        int length = 0;
        if (word.length > pref.length) {
            length = pref.length;
        }else {
            length = word.length;
        }

        for (int i = 0; i < length; i++) {
                if (word[i] != pref[i]) {

                    return false;
                }
            }

        return true;
    }
}
