package com.test.Character;
import java.util.Scanner;

/**
 * 从键盘输入三个数字，比较三个数字大小，三元运算符
 * 从键盘输入一串字符，将大写转为小写字母，小写变大写；
 */
public class CharTrans {
    public static void main(String[] args) {

        UpperTransToLower();

    }
    /**
     * 从键盘输入三个数字，比较三个数字大小;
     * 三元运算符
     */
     private static void Compare(){
         Scanner sc=new Scanner(System.in);
         System.out.println("请输入三个数字");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int temp=a>b?a:b;
         int max=temp>c?temp:c;
         System.out.println(max);
    }
    /**
     * 从键盘输入一串字符，将大写转为小写字母，小写变大写；
     * charAt();
     */
    private static void UpperTransToLower(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("请输入字符");
        String a="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'a'&&str.charAt(i)<'z'){
                a+=(char)(str.charAt(i)-32);
            }else if(str.charAt(i)>'A'&&str.charAt(i)<'Z'){
                a+=(char)(str.charAt(i)+32);
            }else{
                a+=str.charAt(i);
            }
        }
        System.out.println(a);
    }
}
