package learTest1;

import java.io.*;
 class �ַ����������� {
     static void transform(String aoe,String aoc){
         try {
             FileReader fr = new FileReader(aoe);
             BufferedReader br=new BufferedReader(fr);
             FileWriter fw=new FileWriter(aoc);
             BufferedWriter bw=new BufferedWriter(fw);
             String s=null;String s2;

             while((s=br.readLine())!=null){
//                 s2=new String(s.getBytes("iso-8859-1"));
                 bw.write(s);
                 bw.newLine();
                 bw.newLine();
             }
             bw.close();
             fw.close();
             br.close();
             fr.close();
         }catch(IOException ioe){
             System.out.println("��������쳣");
         }

     }
     public static void main(String []args){
         String  aoe="lianxi1.txt";
         String aoc="lianxi2.txt";
         transform(aoe,aoc);
         System.out.println("��Ϯ����");
     }
}
