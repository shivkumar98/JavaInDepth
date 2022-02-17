package CodingExercises.Exercise9;

public class PlatinumPlan extends HealthInsurancePlan    {

	PlatinumPlan(){
		setCoverage(0.90);
	}
	
	public static void main(String[] args) {
		PlatinumPlan pp = new PlatinumPlan();
		System.out.println(pp.getCoverage()); // 0.9
		
	}


	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smokes) {
		return 0.09*salary + getOfferedBy().computeMonthlyPremium(this, age, smokes);
	}
	
}
