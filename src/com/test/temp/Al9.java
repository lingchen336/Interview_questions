package com.test.temp;

import java.util.Arrays;

public class Al9 {
    /**
     * 输入三个值，a,b,c，奖品数量等于三个值的最小值，可以用两个大值换为一个小值，求最终客货奖品数量
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能交换奖品的最大数量
     * @param a int整型
     * @param b int整型
     * @param c int整型
     * @return int整型
     */
    public static int numberofprize(int a, int b, int c) {
        int s[]=new int[3];
        s[0]=a;s[1]=b;s[2]=c;
        Arrays.sort(s);
        int temp=(s[2]-s[0]-1)/2;
        int temp1=(s[1]-s[0]-1)/2;
        while((temp+temp1)>=1){
            Arrays.sort(s);
            temp=(s[2]-s[0]-1)/2;
            temp1=(s[1]-s[0]-1)/2;
            if(s[2]-2<=s[0])break;
            if((temp+temp1)>=1){
                s[0]+=1;
                temp--;
                s[2]-=2;
            }

            if(s[0]>s[1]&&(temp+temp1)>=1){
                s[1]++;
                temp--;
                s[2]-=2;
            }

        }

        return Math.min(s[0],s[1]);
    }

    public static void main(String[] args) {
        int j=numberofprize(10,3,3);
        System.out.println(j);
    }

}
