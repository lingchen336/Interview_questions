package com.test.StringDemo;
import java.util.Scanner;
/*
��Ŀ����������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
�����У���д��ĸ��Сд��ĸ�����֡�����

������
1���Ӽ�������һ���ַ���String,arr.nextLine();
2�������ַ�����char[],toCharArray(),for
3�������ĸ�������ʶ���ַ����࣬ͳ�ƽ�������ĸ�����
 */
public class StringDemo02Count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr=sc.nextLine();
        int a=0,b=0,c=0,d=0;
        for (int i = 0; i <arr.length() ; i++) {
            if(arr.charAt(i)>='0'&&arr.charAt(i)<='9')a++;
            else if (arr.charAt(i)>='a'&&arr.charAt(i)<='z')b++;
            else if(arr.charAt(i)>='A'&&arr.charAt(i)<='Z')c++;
            else d++;
        }
        System.out.println("���ֵĸ����ǣ�"+a+"Сд��ĸ�ĸ����ǣ�"+b+"��д��ĸ�ĸ����ǣ�"+c+"����������ĸ�ĸ����ǣ�"+d);
    }
}
