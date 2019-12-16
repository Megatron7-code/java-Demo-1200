package com.vm322.d117;

public class User {
    public static void main(String[] args) {
        System.out.println("用户选择了GIF模式");
        ImageSaver saver = TypeChooser.getSaver("GIF");
        saver.save();
        System.out.println("用户选择了JPEG模式");
        saver = TypeChooser.getSaver("JPEG");
        saver.save();
        System.out.println("用户选择了PNG模式");
        saver = TypeChooser.getSaver("PNG");
        saver.save();

    }
}
