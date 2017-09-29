package attendance;

public class Student implements Attendee
{
	public String firstName;
	public String lastName;
	public boolean inClass = false;
}

public Student(String firstName, String lastName)
{
	this.firstName = firstName;
	this.lastName = lastName;
	inClass = true;
}