package CodingExercises.Exercise3;

import java.util.ArrayList;

public class StudentUtil {
	

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        // Grade A =4, B=3, C-2
    	double[] returnedGPA = new double[studentsGrades.length];
    	for (int i=0; i<studentsGrades.length; i++ ) {
    		returnedGPA[i] = 0;
    		for (int j = 0; j <studentsGrades[i].length; j++ ) {
    			char grade = studentsGrades[i][j];
    			double gradePoint = 0;
    			switch (grade) {
    			case 'A':
    				gradePoint = 4.0;
    				break;
    			case 'B':
    				gradePoint = 3.0;
    				break;
    			case 'C':
    				gradePoint = 2.0;
    				break;
    			}
    			returnedGPA[i]+=gradePoint;
    		}
    		returnedGPA[i] /= studentsGrades[i].length;
    	}
    	
    	return returnedGPA;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if (lower > higher || lower<0 || higher<0) {
        	return null;
        } else {
        	double[] result = calculateGPA(studentIdList, studentsGrades);
        	int validStudents = 0;
        	ArrayList<Integer> validStudentList = new ArrayList<>();
        	for (int i =0; i<studentIdList.length; i++) {
        		if (lower < result[i] && result[i]<higher) {
        			validStudentList.add(studentIdList[i]);
        		}
        	}
        	
        	return validStudentList.stream().mapToInt(i -> i).toArray();
        	
        }
        
    }
    
    public static void main(String[] args) {
		int[] studentList= new int[] {1001,1002};
		char[][] studentGrades = new char[][] {
			{ 'A', 'A', 'A', 'B' },
			{ 'A', 'B', 'B' }
		};
		
		System.out.println(calculateGPA(studentList, studentGrades)[0]);
		System.out.println(calculateGPA(studentList, studentGrades)[1]);
		System.out.println(getStudentsByGPA(5, 4, studentList, studentGrades));
	}
    
}