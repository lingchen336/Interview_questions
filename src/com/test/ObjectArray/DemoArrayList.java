package com.test.ObjectArray;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList数组：长度可以改变；
对ArrayList<E>来说，<E>代表泛型；集合中所有元素都是统一类型；
重写了toString()方法；

常用方法：
boolean Add(E e):添加元素，尾插，一定会执行成功，返回值可用可不用； 其它集合不一定成功；
E get(int index) :获取元素，参数是索引编号，返回值是对应位置的元素；
E remove(int index):从及格当中删除元素，参数是索引编号，返回值是被删除的元素；
int size():获取集合长度，返回值是集合中的元素个数；
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
//集合数组末尾添加元素
        list.add("赵丽颖");
        list.add("赵又廷");
        list.add("巩俐");
        list.add("章子怡");
        System.out.println(list);
//获取集合长度
        int size=list.size();
        System.out.println(size);
//获取集合中元素
        String get=list.get(2);
        System.out.println(get);
//删除集合中元素
        String rm=list.remove(2);
        System.out.println(rm+list);

//集合遍历
        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //增强for遍历
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
        //Iterator遍历，所有集合、数组都可通过迭代器遍历
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}

