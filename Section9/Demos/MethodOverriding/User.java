package Section9.Demos.MethodOverriding;

public class User {
	
	public int id = 1;
	
	public void printUserType() {
		System.out.println("User");
	}
	
	public void saveWebLink() {
		System.out.println("User: saveWedblink");
	}
	
	public Review postAReview(String reviewString) {
		System.out.println("User: postAReview");
		Review review = new Review(reviewString);
		return review;
	}
}
