package CodingExercises.Exercise5;

public class Book {		
    private String title;
	private String author;
	private int publicationYear;
	private double averageRating;
	private int ratingsCount;
	private String imageUrl;
	
	// Add getters & setters for author, averageRating, and ratingsCount
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public double getAverageRating() {
		return this.averageRating;
	}
	
	public void setAverageRating(double rating) {
		this.averageRating = rating;
	}
	
	public int getRatingsCount() {
		return this.ratingsCount;
	}
	
	public void setRatingsCount(int count) {
		this.ratingsCount = count;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
				+ ", averageRating=" + averageRating + ", ratingsCount=" + ratingsCount + ", imageUrl=" + imageUrl
				+ "]";
	}
	
	
	
}