package CodingExercises.Exercise9;

public class GoldPlan extends HealthInsurancePlan{
	
	GoldPlan(){
		this.setCoverage(0.8);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smokes) {
		return 0.07*salary + getOfferedBy().computeMonthlyPremium(this, age, smokes);
	}

	

}
