package com.vm321.d037;

import java.util.ArrayList;
import java.util.List;

public class UseForeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("hij");
        list.add("klm");
        list.add("nop");
        list.add("qrs");
        System.out.print("foreach 遍历集合\n\t");
        for(String string: list){
            System.out.print(string);
        }
        System.out.println();
        String[] strs = new String[list.size()];
        list.toArray(strs);
        System.out.print("foreach 遍历数组\n\t");
        for(String string:strs){
            System.out.print(string);
        }
    }
}
