package com.vm322.d113;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<Worker>();
        List<Employee> employeeList = new ArrayList<Employee>();
        Worker worker = new Worker("java.inc", 12);
        Employee employee = new Employee("php.inc", 11);
        long currentTIme = System.currentTimeMillis();
        for(int i = 0;i<100000;i++){
            workerList.add(worker.clone());
        }
        System.out.println("使用复制的方式创建对象所花费的时间:");
        System.out.println(System.currentTimeMillis() - currentTIme + "毫秒");
        currentTIme = System.currentTimeMillis();
        for(int i = 0;i< 100000;i++){
            employeeList.add(employee.clone());
        }
        System.out.println("使用序列化的方式创建对象所花费的时间：");
        System.out.println(System.currentTimeMillis() - currentTIme + "毫秒");
    }
}
