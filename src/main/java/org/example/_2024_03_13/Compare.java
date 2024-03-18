package org.example._2024_03_13;

import java.util.Arrays;

public class Compare {
    /**
     * withSharp = ##rt#r##rrr#r#
     * fin = rr
     * <p>
     * [ -1 2 4 3 -5] target 3
     */

    public static void main(String[] args) {
        String withSharp = "##rt#r##rrr#r#";
        String fin = "rr";
        System.out.println(getEq(withSharp, fin));

    }

    private static boolean getEq(String withSharp, String fin) {
        char[] chars = withSharp.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                stringBuilder.append(chars[i]);
            } else if (chars[i] == '#' && !stringBuilder.isEmpty()) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        return stringBuilder.toString().equals(fin);
    }
}
