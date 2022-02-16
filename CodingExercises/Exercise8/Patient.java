package CodingExercises.Exercise8;


public class Patient extends User {
	
	private long patientId;
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	
	public void goesToSleep() {
		System.out.println("Patient fall asleep");
	}
	
	public static void main(String[] args) {
		User p = new Patient();
		//p.goesToSleep(); // throws undefined method exception
	}
	
}

