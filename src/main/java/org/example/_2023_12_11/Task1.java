package org.example._2023_12_11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {

    // заказ
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("з");
        list.add("а");
        list.add("к");
        list.add("а");
        list.add("з");
        //checkPalindrom(list);

//        for (int i = 0; i < 5; i++) {
//            list.listIterator();
//        }
//        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }

    }

    public static boolean checkPalindrom(List<String> list) {
        if (list.listIterator() == list.listIterator(list.size())) {
            System.out.println("+++");
            return true;
        } else {
            System.out.println("----");
            return false;
        }
    }


}


/*
            проверить стрингу на палиндром

 */