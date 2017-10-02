package attendance;

public class Student implements Attendee {
	public String firstName;
	public String lastName;
	public boolean present = false;
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean isPresent() {
		return present;
	}
	
	public void setPresent (boolean present) {
		this.present = present;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean mathces(String first, String last) {
		return (first.toLowerCase().equals(firstName.toLowerCase())) && last.toLowerCase().equals(lastName.toLowerCase());
	}

	public boolean matches(String last) {
		return last.toLowerCase().equals(lastName.toLowerCase());
	}

	public String getReportString() {
		String report = "1";
		report = restrictStringToLength(report, 20);
		report += firstName;
		report = restrictStringToLength(report, 40);
		if(present) {
			report += "PRESENT\n";
		}	
		else {
			report += "ABSENT\n";
		}
		return report;
	}
	
	public String restrictStringToLength(String s, int length) {
		if(s.length() > length) {
			s = s.substring(0, length - 3) + "...";
		}
		while(s.length() < length) {
			s += " ";
		}
		return s;
	}
}


