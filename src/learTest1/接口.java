package learTest1;//���������ֽӿڵ�ʵ�ַ�ʽ����̳У���̬��

interface ������{
    void shine();
}
class �׳�� implements ������{
    public void shine(){
        System.out.println("�����ƹ�");
    }
}
class �չ�� implements ������{
    public void shine(){
        System.out.println("������ɫӫ��");
    }
}
class TestInterface{
    public static void use(������ fgt){ //Ӧ�÷�����
        System.out.println("��װ������"); //�Ȱ�װ
        fgt.shine(); //�����忪ʼ����
    }
    public static void main(String[] args){
        �׳�� bcd = new �׳��(); //���Կ�������һյ�׳��
        System.out.println("����һյ�׳��");
        use(bcd); //Ӧ�ð׳��
        System.out.println();
        �չ�� rgd = new �չ��(); //���Կ�������һյ�չ��
        System.out.println("����һյ�չ��");
        use(rgd); //Ӧ���չ��
    }
}

