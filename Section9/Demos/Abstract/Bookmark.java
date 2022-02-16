package Section9.Demos.Abstract;

public class Bookmark {
	private String title, authors, directors, cast;
	
	// tag field:
	private final String bookmarkType;
	
	public Bookmark(String title, String authors) {
		this.title = title;
		this.authors = authors;
		this.bookmarkType = "book";
	}
	public Bookmark(String title, String directors, String cast) {
		this.title = title; this.directors=directors; this.cast=cast;
		this.bookmarkType = "movie";
	}
	public void isKidFriendlyEligible() {
		if(bookmarkType.equals("book")){
			// code if it is a book
		} else if (bookmarkType.equals("movie")) {
			//code for a movie
		}
	}
	
}
