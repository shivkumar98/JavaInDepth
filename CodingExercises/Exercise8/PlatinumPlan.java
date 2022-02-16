package CodingExercises.Exercise8;

public class PlatinumPlan extends HealthInsurancePlan {

	PlatinumPlan(){
		setCoverage(0.90);
	}
	
	public static void main(String[] args) {
		PlatinumPlan pp = new PlatinumPlan();
		System.out.println(pp.getCoverage()); // 0.9
		
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return salary*0.08;
	}
	
}
