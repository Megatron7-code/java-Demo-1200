package com.vm322.d087;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("胡莱科技", "男", 18);

        System.out.println("员工1的信息");
        System.out.println("姓名：" + person1.getName());
        System.out.println("性别：" + person1.getGender());
        System.out.println("年龄：" + person1.getAge());

        System.out.println("员工2的信息");
        System.out.println("姓名：" + person2.getName());
        System.out.println("性别：" + person2.getGender());
        System.out.println("年龄：" + person2.getAge());
    }
}
