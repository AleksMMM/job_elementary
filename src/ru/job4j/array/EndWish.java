package ru.job4j.array;

public class EndWish {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = 0;

        if (word.length > post.length) {
            count = post.length;

        }else {
            count = word.length - 1;
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 0; i < count ; i++) {
            if (word[word.length -1 - i] != post[post.length - 1 - i]) {

                return false;
            }
        }
        return result;
    }
}
