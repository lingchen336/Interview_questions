package com.test.algorithm.DiGui;
/*
一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。如果所有兔子都不死，那么一年以后可以繁殖多少对兔子？
  分析如下：
  第一个月小兔子没有繁殖能力，所以还是一对；
  两个月后，生下一对小兔子，总数共有两对；
  三个月以后，老兔子又生下一对，因为小兔子还没有繁殖能力，总数共是三对；
*/
public class Fibonacci {
    public static int fun(int m){
        if(m<2){        //第0和第1个数都是1
            return 1;
        }else{
            return fun(m - 1)+
                    fun(m-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(fun(4));
    }
}
