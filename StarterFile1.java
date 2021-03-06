import java.util.*;

public class College{
	// implement our UML Diagram:
	public static void main(String [] args){
		System.out.println("Starting Program");
		TestDriver tester = new TestDriver();
		tester.TestHarness();

		System.out.println("End of Program");
	}
}

class Student{
	private String StudentName;
	private String StudentID;
	private GPA _gpa;

	public Student(String sn, String sid){
		this.StudentName = sn;
		this.StudentID = sid;
	}
}

class GPA{
	private String studentID;
	private String Term;
	private float GPA;
	public GPA(String sid, String _term) {
		this.studentID = sid;
		this.Term = _term;
	}
}

class Group{
	private Vector GroupName = new Vector();
	private String Term;
	public Vector getGroupName(){
		//#TODO write a msg to logfile when accessed 
		return GroupName;
	}
}

class TestDriver{
	public void TestHarness(){
		// test procedure:
		// make at least one student object
		// insert it into the Vector called GroupName

		Student a = new Student("Joe","C001");
		Group g = new Group();
		Vector temp = g.getGroupName();
		temp.addElement(a);
		//#TODO implement code to read/write filesystem: import a text file to populate our vector
	}
}
