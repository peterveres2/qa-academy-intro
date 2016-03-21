
public class QAAcademy {

	int numOfStudents;
	String course;
	String name;
	
	public QAAcademy(int numOfStudents, String course, String name) {
		this.numOfStudents = numOfStudents;
		this.course = course;
		this.name = name;
		toString();
	}
	
	
	@Override
	public String toString() {
		return numOfStudents + " " + course + " " + name;
	}
	
}

class EPAMQAcademy extends QAAcademy {

	public EPAMQAcademy() {
		super(100, "epam", "hello");
	}
	
}

class QAAcademyTest {
	public static void main(String[] args) {
		QAAcademy myAcademy = new QAAcademy(0, "", "");
		myAcademy.course = "  ";
	}
}