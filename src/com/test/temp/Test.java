package com.test.temp;

/*

 */
class Solution {
    private int index = 0;//ȫ������
    private boolean scanUnsignedInteger(String str) {
        //�Ƿ�����޷�����
        int before = index;
        while(str.charAt(index) >= '0' && str.charAt(index) <= '9')
            index++;
        return index > before;
    }
    private boolean scanInteger(String str) {
        //�Ƿ�����з�����
        if(str.charAt(index) == '+' || str.charAt(index) == '-')
            index++;
        return scanUnsignedInteger(str);
    }
    public boolean isNumber(String s) {
        //���ַ���
        if(s == null || s.length() == 0)
            return false;
        //��ӽ�����־
        s = s + '|';
        //�����ײ��Ŀո�
        while(s.charAt(index) == ' ')
            index++;
        boolean numeric = scanInteger(s); //�Ƿ������������
        if(s.charAt(index) == '.') {
            index++;
            //��С���㣬����С������
            //С��������ֻҪ��һ�������־Ϳ��ԣ�������||��
            //ע��scanUnsignedIntegerҪ��ǰ�棬���򲻻��
            numeric = scanUnsignedInteger(s) || numeric;
        }
        if((s.charAt(index) == 'E' || s.charAt(index) == 'e')) {
            index++;
            //ָ������
            //e��E�����߶�Ҫ�����֣�������&&
            numeric = numeric && scanInteger(s);
        }
        //����β���ո�
        while(s.charAt(index) == ' ')
            index++;
        return numeric && s.charAt(index) == '|' ;
    }
}
