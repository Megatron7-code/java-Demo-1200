package com.vm322.d101;

public class Test {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("将箱子的长度设为-1");
        box.setLength(-1);
        box.setHeight(-1);
        box.setWidth(-1);

        System.out.println("箱子的长度：" + box.getLength());
        System.out.println("箱子的宽度：" + box.getWidth());
        System.out.println("箱子的高度：" + box.getHeight());
    }
}
