package com.test.Character;
import java.util.Scanner;

/**
 * 从键盘输入一组字符串，将其中的数字转化为大写字母，其余不变。要求当不写其它算法时，该过程可逆；
 */
public class Char_TransTo {
    public static void main(String[] args) {
        System.out.println("请输入字符");
        Scanner scanner=new Scanner(System.in);
        String arr=scanner.nextLine();

        char [] c=arr.toCharArray();
        String b=charTrans(c);
        System.out.println(b);
    }
    static String charTrans(char []arr){
        String a = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i]>'0'&&arr[i]<'9'){
                a=a+((char)((int)arr[i]%26+(int)'A')+" ");
            }else{
                a=a+arr[i]+" ";
            }
        }
        return a;
    }
}
