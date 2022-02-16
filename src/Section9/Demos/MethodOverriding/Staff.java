package Section9.Demos.MethodOverriding;

public class Staff extends User {

	private int id = 2;
	
	public void printId() {
		System.out.println("id: "+id);
		System.out.println("super.id: "+super.id);
	}
	
	public void printUserType() {
		System.out.println("Staff");
	}
	
	//here is a method override
	// the access modifier cannot be less accessible, i.e. private, default etc
	// the overrided method must return a compatible return type, so this can no longer be void
	public Review postAReview(String reviewText) {
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}
	
	public static void main(String[] args) {
		User staff = new Staff();
		staff.postAReview("my review"); // Staff: postAReview
		// this returned the most specific version of the postAReview implementation
	}
	
}
