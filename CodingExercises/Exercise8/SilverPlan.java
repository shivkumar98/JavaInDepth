package CodingExercises.Exercise8;

public class SilverPlan extends HealthInsurancePlan{
	
	SilverPlan(){
		this.setCoverage(0.7);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return salary*0.06;
	}

}
