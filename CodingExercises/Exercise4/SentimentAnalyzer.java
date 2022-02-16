package CodingExercises.Exercise4;

import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
	public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
			String[] negOpinionWords) {
		int[] featureOpinions = new int[featureSet.length]; // output
		System.out.println("Review: "+review);
		System.out.println("-------------------");
        // your code ~ you will be invoking getOpinionOnFeature	
		for (int i = 0; i < featureSet.length; i++) {
			for (int j = 0; j < featureSet[i].length; j++ ) {
				if (review.contains(featureSet[i][j])) {
					System.out.println("The feature of \""+featureSet[i][j]+ "\" is contained in this review ");

					
					featureOpinions[i]=  getOpinionOnFeature(review,featureSet[i][j], posOpinionWords, negOpinionWords);
					System.out.println("the feature: "+featureSet[i][j]+ " has an opinion of: " +featureOpinions[i]);
					System.out.println("************************");
				}
				
			}
		}
 
		return featureOpinions;
	}

	// First invoke checkForWasPhrasePattern and 
	// if it cannot find an opinion only then invoke checkForOpinionFirstPattern
	private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		int wasPattern = checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
		if (wasPattern==0) {
			return checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
		} else {
			return wasPattern;
		}
		
	
		
	}	

	// Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
	// Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		review = review.replace('!', ' ');
		
		String pattern = feature + " was ";
		
		int ind = review.indexOf(feature);

		if (ind == -1) {
			return 0; // no opinion on feature
		} else { 
			
			//looking for positive match
			for (String positive : posOpinionWords) {

				if (review.contains(pattern + positive ) ) {
					
					System.out.println("found a positive pattern!");
					return 1;
				}
			}
			
			//looking for negative match
			for (String negative : negOpinionWords) {

				if (review.contains(pattern + negative ) ) {
					
					System.out.println("found a negative pattern!: "+pattern + negative );
					return -1;
				}
			}
			
			System.out.println("found neither a positive or negative \"was\" pattern for the feature: "+feature);
			return 0;
			
		}
	
	}
	
	// You can first look for positive opinion. If not found, only then you can look for negative opinion
	private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
			String[] negOpinionWords) {
		// Extract sentences as feature might appear multiple times. 
		// split() takes a regular expression and "." is a special character 
		// for regular expression. So, escape it to make it work!!
		String[] sentences = review.split("[.!]");
		
		for (String sentence:sentences) {
			for (String positive : posOpinionWords) {
				if (sentence.toLowerCase().contains(positive+ " "+feature)) {
					System.out.println("Positive opinion found!: "+positive + " "+feature );
					return 1;
				}
			}
			for (String negative: negOpinionWords) {
				if (sentence.toLowerCase().contains(negative + " "+feature)) {
					System.out.println("Negative opinion found!: "+negative + " "+feature );
					return -1;
				}
			}
			
		}
		System.out.println("no opinions found :( on feature: "+feature);
		return 0;
		
		// your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)		

		
	}

	public static void main(String[] args) {
		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";
		
		//String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };
		
		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}