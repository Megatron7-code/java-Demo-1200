package com.vm322.d114;

public class Test {
    public static void main(String[] args) {
        Login login = new Login("hackintosh", "123321");
        System.out.println("输出原始对象: " + login);
        System.out.println("输出克隆对象：" + login.clone());

    }
}
