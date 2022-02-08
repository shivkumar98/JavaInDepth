package Assignments.Assignment4;

/*
 * Implement the pseudocode of the methods of this class
 */
public class IRUtil {
	
	/*
	 *     Step 1: Convert both term & doc into lower-case

        Step 2: Initialize variable frequencyCount to 0

        Step 3: Initialize variable index with the index position of term in doc. Hint: Use indexOf() method

        Step 4: If index >= 0 (i.e.., term appears in doc), then go to next step. Else go to last step.

        Step 5: Increment frequencyCount

        Step 6: Re-compute doc with the string appearing after term till end of doc. Hint: You can use substring() & length() methods

        Step 7: Re-compute index with index position of term in the re-computed doc. Go to step 4 to continue processing.

        Step 8: Return frequencyCount
        
	 */
	public static int getFrequencyCount(String term, String doc) {
		term = term.toLowerCase();
		doc = doc.toLowerCase();
		int frequencyCount = 0; 
		int index = doc.indexOf(term); 
		//System.out.println("initial index"+index);
		
		while (index>= 0) {
			//System.out.println("index:" + index);
			frequencyCount++;
			//System.out.println("freq "+frequencyCount);
			doc = doc.substring(index+term.length(), doc.length());
			//System.out.println("recomputed doc"+doc);
			index = doc.indexOf(term);
			//System.out.println("recomputed index "+index);
			if (index>=0) {
				continue;
			} else 
				break;
	
		}
		return frequencyCount;
		
	}
	
	/*
	 *  Step 1: int frequencyCount = getFrequencyCount(term, doc);

        Step 2: Create variable totalTermCount to hold the total number of terms appearing in doc
        . Hint: You can use split() with white-space " " as delimiter

        Step 3: return frequencyCount / totalTermCount. This is the tf formula.
	 */
    public static double termFrequency(String term, String doc) {
    	int frequencyCount = getFrequencyCount(term, doc);
    	
    	int totalTermCount = doc.trim().split(" ").length;
    	
    	return (double) frequencyCount / totalTermCount;

    

    }
	
	public static void main(String[] args) {
		System.out.println(getFrequencyCount("yo", "yo yo yo yo bro yo"));
		System.out.println( termFrequency("yo", "yo yo yo yo bro yo") );
	}
	

}
