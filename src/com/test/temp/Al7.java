package com.test.temp;
/*
链接：https://www.nowcoder.com/questionTerminal/96bf0c548a094de7a05919e0b32b1a5a?toCommentId=7174117
来源：牛客网

密码生成器由N个槽位组成，槽位的下标为0~N-1，每个槽位存储一个数。起初每个槽位都是0。
密码生成器会进行M轮计算，每轮计算，小汪会输入两个数L,R(L<=R),密码生成器会将这两个数作为下标，将两个下标之间（包含）的所有槽位赋值为i（i为当前的轮次，i∈[1,M]）。
M轮计算完成后，密码生成器会根据槽位的最终值生成一条密码，密码的生成规则为：
（0*a[0] + 1*a[1] + 2*a[2] + ... + (N-1)*a[N-1]) mod 100000009
其中a[i]表示第i个槽位的最终值。
请帮助小汪把他的密码生成器实现为代码。
输入描述:
第一行为两个整数N,M,表示槽位个数和计算轮数。
接下来M行，每行两个整数Li,Ri，表示第i轮计算的输入。


输出描述:
输出一行，一个整数A,表示小汪的开机密码。

本代码：正向轮询，case通过30%
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Al7{
    public static void main(String args[]) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String line;
        line=bf.readLine();
        int N,M;
        String []arr=line.split(" ");
        N=Integer.parseInt(String.valueOf(arr[0]));
        M=Integer.parseInt(String.valueOf(arr[1]));
        int []str=new int[N];
        for (int m=1;m<=M;m++){
            int l,r;
            line=bf.readLine();
            arr=line.split(" ");
            l=Integer.parseInt(String.valueOf(arr[0]));
            r=Integer.parseInt(String.valueOf(arr[1]));
            if(l>r)break;
            for (int i = l; i <=r ; i++) {
                str[i]=m;
                if(i==N)break;
            }
        }
        long count=0;
        for (int i = 0; i < N; i++) {
            count+=(i*str[i])%100000009;
        }
        System.out.println(count);
    }
}