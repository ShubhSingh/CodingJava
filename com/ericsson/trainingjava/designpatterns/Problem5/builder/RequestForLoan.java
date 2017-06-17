package Problem5.builder;

import Problem5.v1.RequestForLoan.ApplicantType;

public class RequestForLoan {
	private String applicantName;//always needed
	private String address;//optional
	private String purposeOfLoan;//optional
	private String specialRequests;//optional
	private ApplicantType type;// always needed
	private int cibilScore;// needed for all types other than gov
	private int requiredTerm;//optional
	
	private RequestForLoan(RequestForLoanBuilder builder) {
		super();
		this.address = builder.address;
		this.applicantName = builder.applicantName;
		this.cibilScore = builder.cibilScore;
		this.purposeOfLoan = builder.purposeOfLoan;
		this.requiredTerm = builder.requiredTerm;
		this.specialRequests = builder.specialRequests;
		this.type = builder.type;
		
	}
	
	public static RequestForLoanBuilder startBuilding(){
		return new RequestForLoanBuilder();
	}
	public static class RequestForLoanBuilder{
		private String applicantName;//always needed
		private String address;//optional
		private String purposeOfLoan;//optional
		private String specialRequests;//optional
		private ApplicantType type;// always needed
		private int cibilScore;// needed for all types other than gov
		private int requiredTerm;//optional
		
		public RequestForLoanBuilder applicantName(String name){
			this.applicantName = name;
			return this;
		}
		public RequestForLoanBuilder address(String name){
			this.address = name;
			return this;
		}
		public RequestForLoanBuilder purposeOfLoan(String name){
			this.purposeOfLoan = name;
			return this;
		}
		public RequestForLoanBuilder specialRequests(String name){
			this.specialRequests = name;
			return this;
		}
		public RequestForLoanBuilder applicantType(ApplicantType name){
			this.type = name;
			return this;
		}
		public RequestForLoanBuilder cibilScore(int name){
			this.cibilScore = name;
			return this;
		}
		public RequestForLoanBuilder requiredTerm(int name){
			this.requiredTerm = name;
			return this;
		}
		
		public RequestForLoan build(){
			if(this.applicantName == null || this.type == null){
				throw new IllegalArgumentException("name and type always needed");
			}
			if(this.type != ApplicantType.GOVERNMENT && this.cibilScore <= 0){
				throw new IllegalArgumentException("you must be government to borrow w/o cibil rating");
			}
			return new RequestForLoan(this);
		}
	}
	
	
	
	
	
	
	
	
	public String getApplicantName() {
		return applicantName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}
	
	public String getSpecialRequests() {
		return specialRequests;
	}
	
	public ApplicantType getType() {
		return type;
	}
	
	public int getCibilScore() {
		return cibilScore;
	}
	
	public int getRequiredTerm() {
		return requiredTerm;
	}
	
	
	

}
