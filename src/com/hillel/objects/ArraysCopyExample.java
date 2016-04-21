package com.hillel.objects;

import java.util.Arrays;

public class ArraysCopyExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //int[] arrayCopy = Arrays.copyOf(array, array.length);
        int[] arrayCopy = array;

        array[3] = 0;
    }
}
