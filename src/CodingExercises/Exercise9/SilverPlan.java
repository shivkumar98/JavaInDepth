package CodingExercises.Exercise9;

public class SilverPlan extends HealthInsurancePlan{
	
	SilverPlan(){
		this.setCoverage(0.7);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smokes) {
		return 0.06*salary + getOfferedBy().computeMonthlyPremium(this, age, smokes);
	}

	
}
