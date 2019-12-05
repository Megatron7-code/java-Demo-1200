package com.vm321.d061;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("中国日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA).format(date));
        System.out.println("加拿大日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.CANADA).format(date));
        System.out.println("日本日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN).format(date));
        System.out.println("法国日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE).format(date));
        System.out.println("德国日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN).format(date));
        System.out.println("意大利日期: " + DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN).format(date));
    }
}
