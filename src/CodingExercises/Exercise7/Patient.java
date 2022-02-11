package CodingExercises.Exercise7;


public class Patient extends User {
	
	private HealthInsurancePlan insurancePlan;
		private long patientId;
	private boolean insured;
	
	

	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
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

