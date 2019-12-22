package com.vm323.d132;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("java");
        stack.push("php");
        while(!stack.empty()){
            System.out.println((String)stack.pop());
        }
    }
}
