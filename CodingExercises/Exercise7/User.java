package CodingExercises.Exercise7;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	
	// add rest of the variables
	
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