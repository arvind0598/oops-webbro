import java.util.*;
import java.io.*;

class Student implements Serializable
{
    String name;
    String regNo;
    String DOB;
    String branch;
    int year;
    Subject x;

    Student()
    {
        name = regNo = DOB = branch = "uninit";
        year = -1; 
        x = new Subject();
    }
}

class Subject implements Serializable
{
    double ses1[];
    double ses2[];
    double ends[];
    int attendance[];
    Subject()
    {
        ses1 = new double[4];
        ses2 = new double[4];
        ends = new double[4];
        attendance = new int[4];
    }
}

class Demo
{
    public static void main(String[] args) 
    {
        ArrayList<Student> data = new ArrayList<Student>();

        try
        {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("database.txt"));
            while(true)
            {
                Student s = (Student)o.readObject();
                if(s.name.equals("uninit")) break;
                data.add(s);
            }
            o.close();
        }
        catch(Exception e)
        {
            System.out.println("Error." + e);
        }

        for(int j = 0; j < data.size(); j++)
        {
            Student x = data.get(j);
            System.out.println("DETAILS");
            System.out.println(x.name +  " " + x.regNo + " " + x.DOB + " " + x.branch + " " + x.year);
            System.out.println("MARKS");
            System.out.println("SESS 1");
            for(int i = 0; i < 4; i++)
                System.out.println(x.x.ses1[i] + " ");
            System.out.println("SESS 2");
            for(int i = 0; i < 4; i++)
                System.out.println(x.x.ses2[i] + " ");
            System.out.println("END SEMS");
            for(int i = 0; i < 4; i++)
                System.out.println(x.x.ends[i] + " ");
            System.out.println("ATTENDANCE");
            for(int i = 0; i < 4; i++)
                System.out.println(x.x.attendance[i] + " ");

        }
    }
}