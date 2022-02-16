package CodingExercises.Exercise8;

public class BronzePlan extends HealthInsurancePlan {
	
	BronzePlan(){
		this.setCoverage(0.6);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return 0.05*salary;		
	}

}
