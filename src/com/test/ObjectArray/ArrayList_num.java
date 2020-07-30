package com.test.ObjectArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * ��Ŀ��
 * ��һ���󼯺ϴ洢20���������Ȼ��ɸѡ���е�ż�����ŵ�С���ϵ��У�Ҫ��ʹ���Զ���ķ���ʵ��ɸѡ��
 * ������
 * 1���������ϴ洢int����ArrayList<Integer>
 * 2.���������Random nextInt()  ���뼯��add() for()
 * 3.����һ������ɸѡ����
 * ����ֵ���ͣ�ArrayList ��
 * �������ƣ�getArrayList
 * �����б�list
 * �жϣ�num%2==0 ����С����
 */
public class ArrayList_num {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("�󼯺ϣ�");
        Random random=new Random();
        for(int j=0;j<20;j++){
            list.add(random.nextInt(100)+1);
            System.out.print(list.get(j)+" ");
        }
        System.out.println();

        ArrayList<Integer > arr=getArrayList(list);
        Iterator it=arr.iterator();
        System.out.print("С���ϣ�");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("ż���ܹ����ٸ���"+arr.size());
    }
    static ArrayList<Integer> getArrayList(ArrayList list){
        ArrayList<Integer> arrayList=new ArrayList<>();
        Iterator it=list.iterator();
        while(it.hasNext()){
            Integer num= (Integer) it.next();
            if(num% 2==0){
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
