package com.test.Character;
import java.util.Scanner;

/**
 * �Ӽ��������������֣��Ƚ��������ִ�С����Ԫ�����
 * �Ӽ�������һ���ַ�������дתΪСд��ĸ��Сд���д��
 */
public class CharTrans {
    public static void main(String[] args) {

        UpperTransToLower();

    }
    /**
     * �Ӽ��������������֣��Ƚ��������ִ�С;
     * ��Ԫ�����
     */
     private static void Compare(){
         Scanner sc=new Scanner(System.in);
         System.out.println("��������������");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int temp=a>b?a:b;
         int max=temp>c?temp:c;
         System.out.println(max);
    }
    /**
     * �Ӽ�������һ���ַ�������дתΪСд��ĸ��Сд���д��
     * charAt();
     */
    private static void UpperTransToLower(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("�������ַ�");
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
