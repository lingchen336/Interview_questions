package com.test.ObjectArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * 题目：
 * 用一个大集合存储20个随机数，然后筛选其中的偶数，放到小集合当中，要求使用自定义的方法实现筛选。
 * 分析：
 * 1、创建集合存储int数字ArrayList<Integer>
 * 2.生成随机数Random nextInt()  放入集合add() for()
 * 3.定义一个方法筛选集合
 * 返回值类型：ArrayList ，
 * 方法名称：getArrayList
 * 参数列表：list
 * 判断：num%2==0 放入小集合
 */
public class ArrayList_num {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("大集合：");
        Random random=new Random();
        for(int j=0;j<20;j++){
            list.add(random.nextInt(100)+1);
            System.out.print(list.get(j)+" ");
        }
        System.out.println();

        ArrayList<Integer > arr=getArrayList(list);
        Iterator it=arr.iterator();
        System.out.print("小集合：");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("偶数总共多少个："+arr.size());
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
