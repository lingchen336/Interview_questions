package learTest1;

import java.io.*;
import java.util.*;

class �ļ��ַ��� {
    public static void main(String[] args) {
        File f = new File("�ַ���.txt");

        try {
            FileWriter out = new FileWriter(f,true);
            Scanner reader = new Scanner(System.in);
            String s;
            System.out.println("���������ݣ�");
            s = reader.nextLine();
            while (!s.equals("finish")) {
                out.write(s);
                out.write((int) '\r');
                out.write((int) '\n');
                s=reader.nextLine();
            }
            reader.close();
            out.close();
            FileReader in = new FileReader(f);
            int a;
            while ((a = in.read()) != -1) {
                System.out.print((char) a);
            }
            in.close();
        }catch (IOException ioe){
            System.out.print("�����������");
        }


    }
}