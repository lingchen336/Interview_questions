package com.test.ExtendesDemo;

public class NewPhone extends Phone {
    @Override       //������д
    public void show(){
        super.show();
        System.out.println("��ʾͼ��");
        System.out.println("��ʾ����");
        super.call();
    }

    //    ===========���췽��===============================
    public NewPhone(){
//        super();//���ø����޲ι��췽�� Ĭ�Ͻ���
        System.out.println("���๹�췽��");

    }
}
