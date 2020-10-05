package com.test.algorithm.jianzhi;

import java.util.LinkedHashMap;
import java.util.Map;

/*
在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */
class O_50 {
    public static char firstUniqChar(String s) {
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>(16,0.75f,true);
        char[] sc = s.toCharArray();
        for(char c : sc)
        {
            map.put(c, !map.containsKey(c));
        }
        for(Map.Entry<Character, Boolean> d : map.entrySet()){
            if(d.getValue())
                return d.getKey();

        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("ddccdbba"));
//        System.out.println();
//        ccc();
    }

    static void ccc(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put("1月", 20);
//此时就会调用到linkNodeLast()方法，也会调用afterNodeAccess()方法，但会被阻挡在
//if (accessOrder && (last = tail) != e) 之外
        map.put("2月", 30);
        map.put("3月", 65);
        map.put("4月", 43);
//这时不会调用linkNodeLast()，会调用afterNodeAccess()方法将key为“1月”的元素放到最后
        map.put("1月", 35);
//这时不会调用linkNodeLast()，会调用afterNodeAccess()方法将key为“2月”的元素放到最后
        map.put("2月",33);
//调用打印方法
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}


