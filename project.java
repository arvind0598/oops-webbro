import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.Dimension;

/**********************************
PLEASE PROVIDE DOCUMENTATION IN THIS 
FORMAT ABOVE EVERY CLASS MODIFIED.
***********************************/

class Program
{
	public static void main(String[] args) 
	{
		new MainLogin();		
	}
}

/******************
MAIN STUDENT CLASS
******************/

class Student implements Serializable
{
	String name;
	String regNo;
	String birthdate;
	Subject courses[4];

	Student(int)
	{
		/*
		initializes all to "uninit"
		used to mark EOF in database
		four subjects - should be clearly marked
		*/
	}

	Student(String a, String b, String c)
	{
		/*
		parameterized constructor
		*/
	}

	void updateSubject(int pos, Subject a)
	{
		/*
		updates the pos-th subject with the new one
		*/
	}
}

class Subject
{
	int marks[];
	int attendance[];
	char grade;

	Subject()
	{
		/*
		marks stores internals, sess1, sess2, endsems
		attendance is an array of size 10?
		grade is calculated absolutely
		*/		
	}

	Subject(Boolean status, int[] record)
	{
		/*
		true : updates marks
		false : updates attendance
		*/
	}
}

/*************************
CLASSES FOR DEFINING PAGES
*************************/

class StudentPage extends Student
{
	/*
	provides implementation for the student menu
	*/
}

class MainLogin extends JFrame
{
	private JPanel p;
	private JButton b;
	private JLabel user, pass;
	private JTextField username, password;

	MainLogin()
	{
		super("WebBro Login");

		p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		p.setBorder(new TitledBorder("Login"));

		user = new JLabel("Username");
		user.setPreferredSize(new Dimension(100,30));
		p.add(user);

		username = new JTextField();
		username.setPreferredSize(new Dimension(150,30));
		p.add(username);

		pass = new JLabel("Password");
		pass.setPreferredSize(new Dimension(100,30));
		p.add(pass);

		password = new JTextField();
		password.setPreferredSize(new Dimension(150,30));
		p.add(password);

		b = new JButton("Submit");
		p.add(b);
		p.setPreferredSize(new Dimension(300,150));

		JPanel wrapper = new JPanel(new GridBagLayout());
		wrapper.setPreferredSize(new Dimension(400,300));
		wrapper.add(p);

		add(wrapper);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	Boolean checkValidity(String username, String birthdate)
	{
		/*
		checks validity of login credentials
		uses database.txt
		*/
	}
}

interface AdminPage
{
	void AddRecord()
	{
		/*
		uses scanner to input data
		writes object to database.txt
		*/
	}

	void UpdateRecord()
	{
		/*
		uses scanner to input the registration number
		if present in database.txt, modify
		else throw custom error StudentNotFoundException
		(probably works better with swings)
		*/
	}
}

class AdminMarks implements AdminPage
{
	AdminMarks()
	{
		/*
		displays subjectwise marks menu
		*/
	}

	public void AddRecord()
	{
		/*
		overrides interface method
		*/
	}

	public void UpdateRecord()
	{
		/*
		overrides interface method
		*/
	}
}

class AdminAttendance implements AdminPage
{
	AdminAttendance()
	{
		/*
		displays subjectwise attendance menu
		*/
	}

	public void AddRecord()
	{
		/*
		overrides interface method
		*/
	}

	public void UpdateRecord()
	{
		/*
		overrides interface method
		*/
	}
}

/************************
CUSTOM EXCEPTIONS GO HERE
*************************/

class StudentNotFoundException extends Exception()
{

} 