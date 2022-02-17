package CodingExercises.Exercise9;

public class BronzePlan extends HealthInsurancePlan {
	
	BronzePlan(){
		this.setCoverage(0.6);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smokes) {
		return 0.05*salary + getOfferedBy().computeMonthlyPremium(this, age, smokes);
	}



}
