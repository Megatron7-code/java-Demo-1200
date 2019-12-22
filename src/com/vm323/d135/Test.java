package com.vm323.d135;

public class Test {
    public static void main(String[] args) {
        String[] books = {"java", "php", "nodejs"};
        for(String book: books){
            System.out.println(book);
        }
        //按ascii码排序
        String min = GenericComparison.getMin(books);
        System.out.println(min);
    }
}
