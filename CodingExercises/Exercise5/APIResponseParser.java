package CodingExercises.Exercise5;

public class APIResponseParser {

	/**
	 * Parses the input text and returns a Book instance containing the parsed data.
	 * 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
	

	public static Book parse(String response) {
		Book book = new Book();
		String endRule = "<";

		String startRule = "<title>";
		String title = parse(response, startRule, endRule);
		System.out.println("title: " + title);
		book.setTitle(title);

		String author = parse(response, "<id type=\"integer\">10264</id>" + "<name>", endRule);
		System.out
				.println("parse of author: " + parse(response, "<id type=\"integer\">10264</id>" + "<name>", endRule));
		System.out.println("author: " + author);

		book.setAuthor(author);

		System.out.println(
				"parse of pubyear: " + parse(response, "<original_publication_year type=\"integer\">", endRule));
		int pubYear = Integer.parseInt(parse(response, "<original_publication_year type=\"integer\">", endRule));
		book.setPublicationYear(pubYear);

		double averageRating = Double.parseDouble(parse(response, "<average_rating>", endRule));
		System.out.println("avgrating: " + averageRating);

		book.setAverageRating(averageRating);

		System.out.println("ratings count: " + parse(response, "<ratings_count type=\"integer\">", endRule));
		int ratingsCount = Integer
				.parseInt(parse(response, "<ratings_count type=\"integer\">", endRule).replaceAll(",", ""));
		book.setRatingsCount(ratingsCount);

		String imageURL = parse(response, "<image_url>", endRule);
		book.setImageUrl(imageURL);

		// Your code
		return book;
	}

	// write overloaded parse method with the 3 parameters response, startRule,
	// endRule

	private static String parse(String response, String startRule, String endRule) {
		int startIndex = response.indexOf(startRule) + startRule.length();

		response = response.substring(startIndex);
		int endIndex = response.indexOf(endRule);
		;
		return response.substring(0, endIndex);

	}

	public static void main(String[] args) {
		String response = "<work>" + "<id type=\"integer\">2361393</id>"
				+ "<books_count type=\"integer\">813</books_count>"
				+ "<ratings_count type=\"integer\">1,16,315</ratings_count>"
				+ "<text_reviews_count type=\"integer\">3439</text_reviews_count>"
				+ "<original_publication_year type=\"integer\">1854</original_publication_year>"
				+ "<original_publication_month type=\"integer\" nil=\"true\"/>"
				+ "<original_publication_day type=\"integer\" nil=\"true\"/>" + "<average_rating>3.79</average_rating>"
				+ "<best_book type=\"Book\">" + "<id type=\"integer\">16902</id>" + "<title>Walden</title>" + "<author>"
				+ "<id type=\"integer\">10264</id>" + "<name>Henry David Thoreau</name>" + "</author>" + "<image_url>"
				+ "http://images.gr-assets.com/books/1465675526m/16902.jpg" + "</image_url>" + "<small_image_url>"
				+ "http://images.gr-assets.com/books/1465675526s/16902.jpg" + "</small_image_url>" + "</best_book>"
				+ "</work>";

		APIResponseParser.parse(response);
		System.out.println(APIResponseParser.parse(response).toString());
	}
}