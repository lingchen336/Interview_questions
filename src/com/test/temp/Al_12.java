package com.test.temp;

import java.util.Scanner;

/**
 * @author lingchen
 * 设计一个判断密码问题，如果长度小于8 返回1   类型不全包含小写字母、大写字母、数字、其他字符 返回2  否则返回 0
 *
 * Character 方法：
 * isDigit(ch)	如果指定字符是一个数字，返回true
 * isLetter(ch)	如果指定字符是一个字母，返回true
 * isLetterOrDigit(ch)	如果指定字符是一个数字或者字母，返回true
 * isLowerCase(ch)	如果指定字符是一个小写字母，返回true
 * isUpperCase(ch)	如果指定字符是一个大写字母，返回true
 * isDefine(ch) 确定一个字符是否被定义为Unicode中的字符  (包含中文）——
 * isISOControl(ch) 确定字符是ISO控制字符 (不包含中文）
 */
public class Al_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        find(s);

    }
    public static void find(String s){
        if(s.length()==0)return;
        String a[]=s.split(" ");

        for (int i = 0; i < a.length; i++) {
            if(a[i].length()==0)continue;
            if(a[i].length()<8){
                System.out.println(1);
                continue;
            }
            int f1=0,f2=0,f3=0,f4=0;
            char b[]=a[i].toCharArray();
            for (int j = 0; j < b.length; j++) {
                if(Character.isDigit(b[j])){
                    f1=1;
                }else if(Character.isLowerCase(b[j])){
                    f2=1;
                }else if(Character.isUpperCase(b[j])){
                    f3=1;
                }else if(Character.isISOControl(b[j])) {
                    f4=1;
                }
            }
            if(f1!=1||f2!=1||f3!=1||f4!=1){
                System.out.println(2);
                continue;
            }
            System.out.println(0);
        }


    }
}