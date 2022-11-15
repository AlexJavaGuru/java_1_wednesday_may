package lv.javaguru.teacher.lesson_x.insurance_policy.solutions.v1.businesslogic;

import java.math.BigDecimal;

import lv.javaguru.teacher.lesson_x.insurance_policy.solutions.v1.domain.InsuranceObject;
import lv.javaguru.teacher.lesson_x.insurance_policy.solutions.v1.domain.Policy;

public class InsurancePolicyPremiumCalculator {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator
			= new InsuranceObjectPremiumCalculator();

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal insuranceObjectPremium = insuranceObjectPremiumCalculator.calculate(insuranceObject);
			premium = premium.add(insuranceObjectPremium);
		}
		return premium;
	}

}