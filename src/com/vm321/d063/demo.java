package com.vm321.d063;

import java.util.Date;
import java.util.Locale;

public class demo {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("格式化字符串为月份的英文缩写:" + String.format(Locale.US, "%tb", today));
        System.out.println("格式化字符串为月份的英文全写:" + String.format(Locale.US, "%tB", today));

        System.out.println("格式化字符串为星期的英文缩写:" + String.format(Locale.US, "%ta", today));
        System.out.println("格式化字符串为星期的英文全写:" + String.format(Locale.US, "%tA", today));

        System.out.println("格式化字符串为4位的年分值:" + String.format(Locale.US, "%tY", today));
        System.out.println("格式化字符串为2位的年分值:" + String.format(Locale.US, "%ty", today));

        System.out.println("格式化字符串为2位的月份值:" + String.format(Locale.US, "%tm", today));

        System.out.println("格式化字符串为2位的日期值:" + String.format(Locale.US, "%td", today));
        System.out.println("格式化字符串为1位的日期值:" + String.format(Locale.US, "%te", today));
    }
}
