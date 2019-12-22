package com.vm323.d123;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) {
        Class<Position> enumClass = Position.class;
        String modifiers = Modifier.toString(enumClass.getModifiers());
        System.out.println("enum类型的修饰符:" + modifiers);
        System.out.println("enum类型的弗雷:" + enumClass.getSuperclass());
        System.out.println("enum类型的自定义方式:");
        Method[] methods = enumClass.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method);
        }
    }
}
