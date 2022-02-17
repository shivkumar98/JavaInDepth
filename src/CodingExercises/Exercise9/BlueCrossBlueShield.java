package CodingExercises.Exercise9;

public  class BlueCrossBlueShield implements InsuranceBrand{
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smokes) {
		int sum =0;
		System.out.println(insurancePlan.getCoverage());
		if (insurancePlan.getCoverage()== 0.9) {
			if (smokes==true) {
				sum+=100;
			}
			if (age>55) {
				sum+=200;
			}
			return sum;
		} else if (insurancePlan.getCoverage()==0.8) {
			if (smokes==true) {
				sum+=90;
			}
			if (age>55) {
				sum+=150;
			}
			return sum;
		} else if (insurancePlan.getCoverage()==0.7) {
			if (smokes==true) {
				sum+=80;
			}
			if (age>55) {
				sum+=100;
			}
			return sum;
		} else {
			if (smokes) {
				sum+=70;
			}
			if (age>55) {
				sum+=50;
			}
			return sum;
		}
		
		
	}
	
	public static void main(String[] args) {
		User staff = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		insurancePlan.setOfferedBy(insuranceBrand);
		System.out.println( insurancePlan.computeMonthlyPremium(5000,56,true) ) ;
	}
	
	
	
}
