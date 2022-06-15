package com.company;

import java.util.HashSet;
import java.util.Set;

public class MainHome {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(3);
        System.out.println(set2);
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>(set1);
        set3.removeAll(set2); //  2
        set2.removeAll(set1);  //0
        set3.addAll(set2);
        System.out.println(set3);
        return set3;
    }


}
