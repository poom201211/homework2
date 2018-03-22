package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was created to test out recursion methods.
 * @author Thanapoom Rattanathumawat
 */

public class Recursion {

    /**
     * Remove duplicate consecutive items from a list, changing the list parameter.
     * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
     * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
     * Objects are compared using their own equals method.
     * @param list of any kind of object. The elements are not null.
     * @return reference to the list parameter with consecutive duplicates removed.
     */

    public static List unique(List list){
        if(list.size() <= 1)return list;
        if(list.get(0).equals(list.get(1))){
            list.remove(0);
            unique(list);
        }
        else if (list.size() > 2)
            unique(list.subList(1, list.size()));
        return list;
    }

    /**
     * Calculate fibonacci number.
     * @param n
     * @return fibonacci number of given n
     */
    public static long fibonacci(int n) {
        return fibonacciHelper(n, 0 ,1);
    }

    /**
     * Recursively calculate the next fibonacci number
     * using the 2 previous numbers to help.
     * @param n
     * @param start
     * @param current
     * @return the next fibonacci in terms of given n
     */
    public static long fibonacciHelper(int n, int start, int current) {
        if (n == 0) return start;
        return fibonacciHelper(n - 1, current, current + start);
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("b");
        list.add("b");
        list.add("a");

        System.out.println(unique(list));

        System.out.println(fibonacci(20));
    }
}
