package CodingExercises.Exercise9;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private boolean insured;
	private int age;
	private boolean smokes;
	private HealthInsurancePlan insurancePlan;

	
	// add rest of the variables
	
	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSmokes() {
		return smokes;
	}
	public void setSmokes(boolean smokes) {
		this.smokes = smokes;
	}
	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	// add rest of the getters & setters
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
}