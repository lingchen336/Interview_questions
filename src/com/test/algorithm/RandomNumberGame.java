package com.test.algorithm;
import java.util.Random;
import java.util.Scanner;

/**
 * ������Ϸ������һ��1-100֮����������ä��7��
 * Random���� ����ҿ�
 */

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        //����һ��1--100�������
        int num=rd.nextInt(100)+1;
        System.out.println("��Χ��1--100֮��");
        boolean flag=true;
        for(int i=0;i<7;i++){
            System.out.println("������һ�����֣�");
            int a =sc.nextInt();
            if(a==num){
                System.out.println("��ϲ�㣬�µ��ˣ�");
                flag=false;
                break;
            }else if(a>num){
                System.out.println("��´��ˣ���ȷ�𰸱�"+a+"С");
            }else{
                System.out.println("��´��ˣ���ȷ�𰸱�"+a+"��");
            }
        }

        if(flag){
            System.out.println("��������ù��ˣ�");
        }
    }
}
