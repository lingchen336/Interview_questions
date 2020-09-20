package com.test.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合：
    存储自定义类型的数据作为Key时，必须重写hashcode方法和equals方法以保证Key唯一。
Map集合的遍历方式:
    第一种：通过键找值方法
        Map集合中的方法：
            Set<key> keySet()返回刺影黑色中包涵的键的Set视图
        实现步骤：
            1.使用Map集合中的方法keySet（），把Map集合所有的key取出来，存储到一个Set集合中
            2.遍历Set集合，获取Map集合中的每一个key
            3.使用Map集合中的方法get(key)，通过key找到value
    第二种：通过遍历Map集合中的Entry对象
        Map集合中的方法：
            Set<Map.Entry<K,V>>entrySet()返回次映射中包含的映射关系的Set视图
        实现步骤：
            1.使用Map集合中的方法entrySet（），把Map集合中的多个Entry对象取出来，存储到一个Set集合中
            2.遍历Set集合，获取每一个Entry
            3.使用Entry对象中的方法getKey()和getValue（）获取键值对
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("赵丽颖",18);
        map.put("杨颖",17);
        map.put("范冰冰",19);
//        1.Set<key> keySet()返回刺影黑色中包涵的键的Set视图
        Set<String> set=map.keySet();
/*---------------第一种方法-------------------------------------------*/
System.out.println("----------------iterator遍历--------------");
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            String  temp= (String) iterator.next();
//            3.使用Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(temp);
            System.out.println(temp+" ="+value);
        }

System.out.println("---------------增强for----------------------------");
        for(String key:set){
 //            3.使用Map集合中的方法get(key)，通过key找到value
            Integer value=map.get(key);
            System.out.println(value+key);
        }
/*---------------------第二种方法：遍历Entry集合-------------------------------------*/
        System.out.println("----------------------------------------------------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> val:entries){
            String key = val.getKey();
            Integer value = val.getValue();
            System.out.println(key+value);
        }

    }
}
