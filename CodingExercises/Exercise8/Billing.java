package CodingExercises.Exercise8;

import java.util.Arrays;

public class Billing {
	   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        payments[0] = amount*patientInsurancePlan.getCoverage();
        payments[1] = amount - payments[0];
        return payments;
    }
    
    public static void main(String[] args) {
		Patient p = new Patient();
		p.setInsurancePlan(new PlatinumPlan());
		double amount = 950.0;
		double[] x = computePaymentAmount(p, amount);
		Arrays.stream(x).forEach(System.out::println);
	}

}

