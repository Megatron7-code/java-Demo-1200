package com.vm323.d127;

import java.sql.SQLOutput;
import java.util.EnumSet;

import static com.vm323.d127.Weeks.MONDAY;
import static com.vm323.d127.Weeks.THURSDAY;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Weeks> week = EnumSet.noneOf(Weeks.class);
        week.add(MONDAY);
        System.out.println("EnumbSet中的元素：" + week);
        week.remove(MONDAY);
        System.out.println("EnumbSet中的元素:" + week);
        week.addAll(EnumSet.complementOf(week));
        System.out.println("EnumSet中的元素:" + week);
        week.removeAll(EnumSet.range(MONDAY, THURSDAY));
        System.out.println("EnumSet中的元素:" + week);
    }
}
