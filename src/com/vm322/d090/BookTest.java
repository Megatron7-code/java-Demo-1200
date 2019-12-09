package com.vm322.d090;

public class BookTest {
    public static void main(String[] args) {
        String[] titles = {"java", "python", "go"};
        for(int i=0;i<titles.length;i++){
            new Book(titles[i]);
        }
        System.out.println("共计出售"+ Book.getCounter() +"本");
    }
}
