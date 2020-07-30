package com.test.ObjectArray;
/**
 * 遍历集合ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList<Person >list=new ArrayList<>();
        list.add(new Person("李白",600));
        list.add(new Person("杜甫",580));
        list.add(new Person("王维",680));

        printArrsyList(list);
    }
    static void printArrsyList(ArrayList<Person> list){
        Iterator it=list.iterator();
        while(it.hasNext()) {
            Person person= (Person) it.next();
            System.out.println(person.getName()+"今年"+person.getAge()+"岁！");
        }
    }

}
