package CodingExercises.Exercise8;

public class GoldPlan extends HealthInsurancePlan{
	
	GoldPlan(){
		this.setCoverage(0.8);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return salary*0.07;
	}

}
