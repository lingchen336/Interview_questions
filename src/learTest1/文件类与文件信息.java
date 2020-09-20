package learTest1;

import java.io.*;
import java.util.Date;
class TestFile2
{
    public static void main(String args[]) throws IOException
    {
        File dir2=new File("F:\\Interview questions\\src\\java.txt");
        File fileName2[]=dir2.listFiles();  //使用了方法File[ ] listFiles()
        File s=null;
        for(int i=0;i<fileName2.length;i++)
        {
            if(fileName2[i].getName().endsWith(".java"))
            {
                if(s==null){

                    s=fileName2[i];
                }

                System.out.println(fileName2[i].getName());
            }
        }
        System.out.println(
                "Name: " + s.getName()
                        +"\nParent: " + s.getParent()
                        +"\nPath: " + s.getPath()
                        +"\nAbsolutePath: " + s.getAbsolutePath()
                        +"\nAbsolute? " + s.isAbsolute()
                        +"\nCan read: " + s.canRead()
                        +"\nCan write: " + s.canWrite()
                        +"\nExist: " + s.exists()
                        +"\nLength: " + s.length()
                        +"\nLast Modified: " + new Date(s.lastModified())
        );
        s=new File("F:\\java项目\\src\\aa.txt");
        s.createNewFile();
    }
}