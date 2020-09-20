package com.test.temp;
/*
链接：https://www.nowcoder.com/questionTerminal/c27561e5b7e0441493adb9a54071888d
来源：牛客网
例如字符串ABCABCABC将会被压缩为[3|ABC]，现在小Q的同学收到了小Q发送过来的字符串，你能帮助他进行解压缩么？
    输入第一行包含一个字符串s，代表压缩后的字符串。
    S的长度<=1000;
    S仅包含大写字母、[、]、|;
    解压后的字符串长度不超过100000;
    压缩递归层数不超过10层;

    输入：HG[3|B[2|CA]]F
输出：HGBCACABCACABCACAF
说明：HG[3|B[2|CA]]F−>HG[3|BCACA]F−>HGBCACABCACABCACAF

 */
import java.util.*;
public class Al6{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        while(str.contains("]")) {
            int right = str.indexOf("]");
            int left = str.lastIndexOf("[",right);
            String tmp = str.substring(left+1,right); // 2|CA
            String[] splits = tmp.split("\\|");
            int n = Integer.parseInt(splits[0]);
            String str2 = "";
            for(int i = 0; i < n;i++) {
                str2 += splits[1];
            }
            str  = str.replace("[" + tmp + "]", str2);//HG[3|BCACA]F]

        }
        System.out.println(str);
    }
}