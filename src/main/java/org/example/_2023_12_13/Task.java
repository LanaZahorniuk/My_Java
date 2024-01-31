package org.example._2023_12_13;

import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        StackImpl<String> stack = new StackImpl();
        String str1 = "Lana";
        String str2 = "Sara";
        String str3 = "Max";
        String str4 = "Tom";
        stack.put(str1);
        stack.put(str2);
        stack.put(str3);
        stack.put(str4);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.get());
        System.out.println(stack.pop());
        System.out.println(stack.get());
        System.out.println(stack);

    }

    public static void reverse(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty.");
        }
        char[] chars = str.toCharArray();


    }

    public static void addChar(char[] chars) {
        Stack<Character> stack = new Stack<>();
        for (char c :
                chars) {
            stack.add(c);
        }
    }
}
