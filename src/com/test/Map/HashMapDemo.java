package com.test.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map���ϣ�
    �洢�Զ������͵�������ΪKeyʱ��������дhashcode������equals�����Ա�֤KeyΨһ��
Map���ϵı�����ʽ:
    ��һ�֣�ͨ������ֵ����
        Map�����еķ�����
            Set<key> keySet()���ش�Ӱ��ɫ�а����ļ���Set��ͼ
        ʵ�ֲ��裺
            1.ʹ��Map�����еķ���keySet��������Map�������е�keyȡ�������洢��һ��Set������
            2.����Set���ϣ���ȡMap�����е�ÿһ��key
            3.ʹ��Map�����еķ���get(key)��ͨ��key�ҵ�value
    �ڶ��֣�ͨ������Map�����е�Entry����
        Map�����еķ�����
            Set<Map.Entry<K,V>>entrySet()���ش�ӳ���а�����ӳ���ϵ��Set��ͼ
        ʵ�ֲ��裺
            1.ʹ��Map�����еķ���entrySet��������Map�����еĶ��Entry����ȡ�������洢��һ��Set������
            2.����Set���ϣ���ȡÿһ��Entry
            3.ʹ��Entry�����еķ���getKey()��getValue������ȡ��ֵ��
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("����ӱ",18);
        map.put("��ӱ",17);
        map.put("������",19);
//        1.Set<key> keySet()���ش�Ӱ��ɫ�а����ļ���Set��ͼ
        Set<String> set=map.keySet();
/*---------------��һ�ַ���-------------------------------------------*/
System.out.println("----------------iterator����--------------");
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            String  temp= (String) iterator.next();
//            3.ʹ��Map�����еķ���get(key)��ͨ��key�ҵ�value
            Integer value = map.get(temp);
            System.out.println(temp+" ="+value);
        }

System.out.println("---------------��ǿfor----------------------------");
        for(String key:set){
 //            3.ʹ��Map�����еķ���get(key)��ͨ��key�ҵ�value
            Integer value=map.get(key);
            System.out.println(value+key);
        }
/*---------------------�ڶ��ַ���������Entry����-------------------------------------*/
        System.out.println("----------------------------------------------------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> val:entries){
            String key = val.getKey();
            Integer value = val.getValue();
            System.out.println(key+value);
        }

    }
}
