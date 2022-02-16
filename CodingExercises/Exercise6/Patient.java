package CodingExercises.Exercise6;

public class Patient extends User {
	
	private long patientId;
	private boolean insured;
	
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	
	
	public void goesToSleep() {
		System.out.println("Patient fall asleep");
	}
	


	public static void main(String[] args) {
		User p = new Patient();
		//p.goesToSleep(); // throws undefined method exception
	
	}
	

}
