package com.vm323.d134;

import java.util.List;

public class GenericQueryTest {
    public static void main(String[] args) {
        String sql = "select * from test";
        List<Books> list = GenericQuery.query(sql, Books.class);
        for(Books books:list){
            System.out.println(books);
        }
    }
}
