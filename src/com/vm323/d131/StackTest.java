package com.vm323.d131;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("向栈中添加字符");
        stack.push("java");
        stack.push("php");
        System.out.println("打印字符：");
        while(!stack.empty()){
            System.out.println((String)stack.pop());
        }
    }
}
