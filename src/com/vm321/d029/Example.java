package com.vm321.d029;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入员工姓名：");
        String name = scan.nextLine();
        System.out.println("请输入新员工应聘的编程语言：");
        String language = scan.nextLine().toLowerCase();
        switch (language.hashCode()){
            // TODO: 优化这些数字 换成能看懂的内容
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工"+name+"被分配到java部门");
                break;
            case 3104:
            case 2112:
                System.out.println("员工"+name+"被分配到c#部门");
                break;
            case -709190099:
                System.out.println("员工"+name+"被分配到.net部门");
                break;
            default:
                System.out.println("公司不需要"+language+"语言的开发人员");

        }
    }
}
