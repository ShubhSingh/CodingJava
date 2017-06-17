package Problem5.builder;

import Problem5.v1.RequestForLoan.ApplicantType;

public class BuiderUser {
	public static void main(String[] args) {
		RequestForLoan loanApplication = 
				RequestForLoan.startBuilding()
				.applicantName("pradeep")
				.applicantType(ApplicantType.INDIVIDUAL)
				.requiredTerm(5)
				.cibilScore(100)
				.build();
		
		

	}

}
