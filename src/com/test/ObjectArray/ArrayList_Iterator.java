package com.test.ObjectArray;
/**
 * ��������ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Person >list=new ArrayList<>();
        list.add(new Person("���",600));
        list.add(new Person("�Ÿ�",580));
        list.add(new Person("��ά",680));

        printArrsyList(list);
    }
    static void printArrsyList(ArrayList<Person> list){
        Iterator it=list.iterator();
        while(it.hasNext()) {
            Person person= (Person) it.next();
            System.out.println(person.getName()+"����"+person.getAge()+"�꣡");
        }
    }

}
