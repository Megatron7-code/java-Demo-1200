package com.vm323.d136;

public class Test {
    public static void main(String[] args) {
        String[] books = {"java", "php", "nodejs"};
        for(String book: books){
            System.out.println(book);
        }
        GenericComparison<String> gc = new GenericComparison<String>();
        String max = gc.getMax(books);
        System.out.println(max);
    }
}
