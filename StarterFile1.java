public class College{
	// implement our UML Diagram:
	public static void main(String [] args){
		System.out.println("HELLO");

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
}

class Group{
	private Vector GroupName;
	private String Term;
}

class TestDriver{
	public void TestMethod(){
		// test procedure:
		// make at least one student object
		// insert it into the Vector called GroupName

		Student a = new Student("Joe","C001");
	}
}
