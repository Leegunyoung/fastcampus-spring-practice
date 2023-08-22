package org.example;

import org.example.logic.BubbleSort;
import org.example.logic.JavaSort;
import org.example.logic.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort=new JavaSort<>();
        System.out.println("[result]"+sort.sort(Arrays.asList(args)));
    }
}