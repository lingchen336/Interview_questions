package learTest1;//TreeSet<E>泛型类练习

import java.util.*;

class Stu implements Comparable
{
    int id;
    String name;
    double mathScore;
    double computerScore;

    public Stu(int id,String name,double mathScore,double computerScore)
    {
        this.id=id;
        this.name=name;
        this.mathScore=mathScore;
        this.computerScore=computerScore;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

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

    public int compareTo(Object b)
    {
        Stu t=(Stu)b;
        if(this.mathScore==t.mathScore)
            return 1;
        else
            return (int)((this.mathScore-t.mathScore)*10);
    }
}

class TestTreeSet
{
    public  static void main(String args[])
    {
        TreeSet<Stu> tree=new TreeSet<Stu>();

        Stu s1,s2,s3,s4,s5;
        s1=new Stu(1001,"liuli",96,90);
        s2=new Stu(1002,"zhaoyi",86,90);
        s3=new Stu(1003,"zhangli",92,86);
        s4=new Stu(1004,"wangxi",86,90);
        s5=new Stu(1005,"qianyi",95,96);

        tree.add(s1);
        tree.add(s2);
        tree.add(s3);
        tree.add(s4);
        tree.add(s5);

        System.out.println("树集中的学生信息如下：");

        //使用Iterator<Student>泛型类遍历tree
        Iterator<Stu> t=tree.iterator();
        while(t.hasNext())
        {
            Stu s=t.next();
            System.out.printf("%d\t%s\t%.1f\t%.1f\n",s.getId(),s.getName(),s.getMathScore(),s.getComputerScore());
        }

    }
}