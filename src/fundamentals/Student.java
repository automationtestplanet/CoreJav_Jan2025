package fundamentals;

public class Student {

	String sName;
	int rollNo;
	static String collegeName;
	static String qualification;

	void displayStudentDetails() {
		System.out.println("Name: " + sName);
		System.out.println("RollNo: " + rollNo);
		System.out.println("College Name: " + Student.collegeName);
		System.out.println("Qualification: " + Student.qualification);
	}

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.sName = "RAM";
		student1.rollNo = 101;
		Student.collegeName = "MLR College";
		Student.qualification = "BTech";

		Student student2 = new Student();
		student2.sName = "Krish";
		student2.rollNo = 102;
		Student.collegeName = "MLR College";
		Student.qualification = "BTech";

		Student student3 = new Student();
		student3.sName = "Shiv";
		student3.rollNo = 103;
		Student.collegeName = "MLR College";
		Student.qualification = "BTech";

		System.out.println("----------Student 1---------");
		student1.displayStudentDetails();

		System.out.println("--------Student 2-----------");
		student2.displayStudentDetails();

		System.out.println("--------Student 3-----------");
		student3.displayStudentDetails();

	}

}
