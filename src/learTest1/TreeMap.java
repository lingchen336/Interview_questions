package learTest1;

import java.util.*;
class key implements Comparable
{
    double num=0;
    key(double num)
    {
        this.num=num;
    }
    public int compareTo(Object b)
    {
        key t=(key)b;
        if(this.num == t.num)
            return 1;
        else
            return (int)((this.num-t.num)*10);
    }
}

class Stud
{
    int id;
    String name;
    double mathScore;
    double computerScore;

    public Stud(int id,String name,double mathScore,double computerScore)
    {
        this.id=id;
        this.name=name;
        this.mathScore=mathScore;
        this.computerScore=computerScore;
    }

//    public int getId()
//    {
//        return id;
//    }
//
//    public void setId(int id)
//    {
//        this.id = id;
//    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getMathScore()
    {
        return mathScore;
    }

    public void setMathScore(double mathScore)
    {
        this.mathScore = mathScore;
    }


    public double getComputerScore()
    {
        return computerScore;
    }

    public void setComputerScore(double computerScore)
    {
        this.computerScore = computerScore;
    }

}
class TestTreeMap1
{
    public static void main(String args[ ])
    {
        TreeMap<key,Stud> treemap=new TreeMap<key,Stud>();
        /* public class TreeMap<K,V>        它扩展了AbstractMap类并实现了NavigableMap接口。这'K'是键的类型，是键'V'映射值的类型。
        extends AbstractMap<K,V>
        implements NavigableMap<K,V>, Cloneable, java.io.Serializable
              {
                //implementation
             }
        */
        Stud s1,s2,s3,s4,s5;
        s1=new Stud(1001,"liuli",96,92);
        s2=new Stud(1002,"zhaoyi",86,90);
        s3=new Stud(1003,"zhangli",92,86);
        s4=new Stud(1004,"wangxi",95,85);
        s5=new Stud(1005,"qianyi",90,96);

        treemap.put(new key(s1.mathScore),s1);
        treemap.put(new key(s2.mathScore),s2);
        treemap.put(new key(s3.mathScore),s3);
        treemap.put(new key(s4.mathScore),s4);
        treemap.put(new key(s5.mathScore),s5);

        int number=treemap.size();
        System.out.println("树映射中有"+number+"个对象:");
        Collection<Stud> collection=treemap.values();
        Iterator<Stud> iter=collection.iterator();
        while(iter.hasNext())
        {
            Stud s=iter.next();
            System.out.printf("%d\t%s\t%.1f\t%.1f\n",s.id,s.getName(),s.getMathScore(),s.getComputerScore());
        }

    }
}