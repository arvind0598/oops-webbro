import java.util.*;
import java.io.*;

class Student implements Serializable
{
    String name;
    String regNo;
    String DOB;
    String branch;
    int year;

    Student()
    {
        name = regNo = DOB = branch = "uninit";
        year = -1; 
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

        System.out.println(data.size());

        for(int i = 0; i < data.size(); i++)
        {
            Student x = data.get(i);
            System.out.println(x.name +  " " + x.regNo);
        }
    }
}