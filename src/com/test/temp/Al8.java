package com.test.temp;
import java.util.Scanner;
/*
链接：https://www.nowcoder.com/questionTerminal/8389e1ccd47d40ba859c2497a428d0ca
来源：牛客网

在搜索引擎后端服务中，需要对恶意的抓取进行限制，其中的一个环节即对访问IP进行限制。请设计一个IP过滤器，实现对访问的IP限制的功能。对IP的限制数据有三种格式：
1.全IP：如222.205.58.16
2.前面带 *：如 *.58.16
3.后面带 *：如 222.205.58.*
带 * 的表示匹配到任意的IP段均可，且 * 可以代表多个ip段，且 * 只能出现在开头或者结尾。
现给出若干条需要过滤的规则，以及若干输入的IP，你需要输出这若干条IP是否会被过滤

输入描述:
输入的第一行是过滤规则的条数N和需要过滤的IP数量M，之后的N行为IP的过滤规则且均合法，再之后的M行为需要进行判断是否被过滤的IP。其中N<100，M<50。


输出描述:
0：该条IP不会被过滤
1：该条IP会被过滤
总共M条需要判断的IP需要以空格作为区分
 */
/**
 * 前缀 后缀 的匹配问题 easy
 * endsWith()   startsWith()  replace("","")
 */


public class Al8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        //读取规则
        String[] patterns = new String[N];
        for(int i =0 ;i < N;i++){
            patterns[i] = sc.nextLine();
        }

        //读取IP
        String[] IPs = new String[M];
        for(int i = 0;i < M; i++){
            IPs[i] = sc.nextLine();
        }

        //暴力匹配
        for(int i = 0; i < IPs.length;i++){
            boolean lock = false;
            for(int j = 0; j < patterns.length;j++){
                String t = "";
                if(patterns[j].charAt(0) == '*'){
                    t = patterns[j].replace("*","");
                    if(IPs[i].endsWith(t)){
                        System.out.print(1 + " ");
                        lock = true;
                        break;
                    }
                }else if(patterns[j].charAt(patterns[j].length()-1) == '*'){
                    t = patterns[j].replace("*","");
                    if(IPs[i].startsWith(t)){
                        System.out.print(1 + " ");
                        lock = true;
                        break;
                    }
                }else{

                    if(patterns[j].equals(IPs[i])){
                        System.out.print(1 + " ");
                        lock = true;
                        break;
                    }
                }
            }
            if(lock == false){
                System.out.print(0 + " ");
            }
        }
    }
}