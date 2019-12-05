package com.vm322.d083;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("《从入门到放弃》", "鸡舍", 68.8);
        System.out.println("书名: " + book.getTitle());
        System.out.println("作者: " + book.getAuthor());
        System.out.println("价格: " + book.getPrice());
    }
}
