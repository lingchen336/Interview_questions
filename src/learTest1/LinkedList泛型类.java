package learTest1;

import java.util.*;

class Student
{
    int id;
    String name;
    double mathScore;
    double computerScore;

    public Student(int id,String name,double mathScore,double computerScore)
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
}
class TestLinkedList
{
    public  static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        LinkedList<Student> list=new LinkedList<Student>();

        System.out.println("请输入5位学生信息：");
        for(int i=0;i<5;i++)
        {
            System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩");
            Student t=new Student(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble());
            list.add(t);
        }

        System.out.println("链表中的学生信息如下：");
        for(int i=0;i<list.size();i++)
        {
            Student temp=list.get(i);
            System.out.printf("%d\t%s\t%.1f\t%.1f\n",temp.getId(),temp.getName(),temp.getMathScore(),temp.getComputerScore());
        }

        list.remove(2);
        System.out.println("新的学生信息如下：");
        for(int i=0;i<list.size();i++)
        {
            Student temp=list.get(i);
            System.out.printf("%d\t%s\t%.1f\t%.1f\n",temp.getId(),temp.getName(),temp.getMathScore(),temp.getComputerScore());
        }
    }
}