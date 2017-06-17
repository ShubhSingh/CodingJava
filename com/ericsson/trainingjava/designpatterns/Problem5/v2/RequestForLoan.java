package Problem5.v2;

import Problem5.v1.RequestForLoan.ApplicantType;

public class RequestForLoan {
	private String applicantName;//always needed
	private String address;//optional
	private String purposeOfLoan;//optional
	private String specialRequests;//optional
	private ApplicantType type;// always needed
	private int cibilScore;// needed for all types other than gov
	private int requiredTerm;//optional
	
	public RequestForLoan() {
		super();
		// bean style. where's validation?
	}
	
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}
	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}
	public String getSpecialRequests() {
		return specialRequests;
	}
	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}
	public ApplicantType getType() {
		return type;
	}
	public void setType(ApplicantType type) {
		this.type = type;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public int getRequiredTerm() {
		return requiredTerm;
	}
	public void setRequiredTerm(int requiredTerm) {
		this.requiredTerm = requiredTerm;
	}
	
	

}
