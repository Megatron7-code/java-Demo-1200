package com.vm321.chapter2;

/**
 * 018
 * Created by Megatron on 2017/1/14.
 */
public class PrintErrorAndDebug {
    public static void main(String[] args){
        System.out.println("main() 方法运行了");
        //输出错误信息
        System.err.println("在运行期间手动输出一个错误信息");
        System.err.println("\t 该软件没有买保险，请注意安全");
        System.err.println("PrintlnErrorAndDebug.main()");
        System.err.println("main()方法结束运行。");
        //TODO err信息和out信息有时输出的顺序会不一致
    }
}
