package com.test.temp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
字符串最长子序列
 */

public class Al_23_II{
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.print(findMaxSubstr(s));
            System.out.println();
        }
    }
    public static String findMaxSubstr (String str) {
        // write code here
        int ans=0,n=str.length();
        int flaf1=0,flag2=0;
        if(n==0)return "";
        Map<Character,Integer> map=new HashMap<>();
        for (int start=0,end = 0; end <n ;end++) {
            char temp=str.charAt(end);
            if(map.containsKey(temp)){
                start=Math.max(start,map.get(temp)+1);
            }
            if(ans<end-start){
                flaf1=start;
                flag2=end;
                ans=end-start;
            }
            map.put(temp,end);

        }
        return str.substring(flaf1,flag2+1);
    }
}