package com.stringManipulation;

import java.util.Objects;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "   This will be going    ";

        System.out.println(str.trim());

        String [] subStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : subStr) {
            if (!Objects.equals(s, ""))
                sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
