package com.test.ExtendesDemo;
/*
super�ؼ����������ʸ������ݣ���this�ؼ����������ʱ������ݡ�

1���ڱ���ĳ�Ա�����У����ʱ���ĳ�Ա������
2.�ڱ���ĳ�Ա�����з��ʱ���ĳ�Ա������
3���ڱ���Ĺ��췽���з��ʱ������һ�����췽����
    A:��this��...)����Ҳ�����ǹ��췽���ĵ�һ����䣬Ψһһ����
    B:��this��super����ͬʱ����
 */
public class Demo02This extends Demo02��est {
        int num=super.n;
    public Demo02This(){
        this(123);
    }
    public Demo02This(int n){
        System.out.println("this is "+n);
    }
    public  void supergrils() {
        int num=10;
        System.out.println(num);
        System.out.println("fanbingbing����Ů�ָ��ߣ���");
        System.out.println(this.num);
    }
}
