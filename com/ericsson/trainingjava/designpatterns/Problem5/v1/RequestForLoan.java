package Problem5.v1;

public class RequestForLoan {
	
	public static enum ApplicantType{
		CORPORATE,GOVERNMENT,INDIVIDUAL;
	}
	private String applicantName;//always needed
	private String address;//optional
	private String purposeOfLoan;//optional
	private String specialRequests;//optional
	private ApplicantType type;// always needed
	private int cibilScore;// needed for all types other than gov
	private int requiredTerm;//optional
	
	public RequestForLoan(String applicantName, ApplicantType type) {
		super();
		this.applicantName = applicantName;
		this.type = type;
		if(this.type != ApplicantType.GOVERNMENT)
			throw new IllegalArgumentException("Only government can avail loan without CIBIL score!!");
	}
	public RequestForLoan(String applicantName, String address,	ApplicantType type) {
		super();
		this.applicantName = applicantName;
		this.address = address;
		this.type = type;
		if(this.type != ApplicantType.GOVERNMENT)
			throw new IllegalArgumentException("Only government can avail loan without CIBIL score!!");
	}
	public RequestForLoan(String applicantName, String address,String purposeOfLoan, ApplicantType type) {
		super();
		this.applicantName = applicantName;
		this.address = address;
		this.purposeOfLoan = purposeOfLoan;
		this.type = type;
		if(this.type != ApplicantType.GOVERNMENT)
			throw new IllegalArgumentException("Only government can avail loan without CIBIL score!!");
	}
	public RequestForLoan(String applicantName, String address,String purposeOfLoan, String specialRequests, ApplicantType type) {
		super();
		this.applicantName = applicantName;
		this.address = address;
		this.purposeOfLoan = purposeOfLoan;
		this.specialRequests = specialRequests;
		this.type = type;
		if(this.type != ApplicantType.GOVERNMENT)
			throw new IllegalArgumentException("Only government can avail loan without CIBIL score!!");
	}
	public RequestForLoan(String applicantName, String address,String purposeOfLoan, String specialRequests, ApplicantType type,
			int cibilScore) {
		super();
		this.applicantName = applicantName;
		this.address = address;
		this.purposeOfLoan = purposeOfLoan;
		this.specialRequests = specialRequests;
		this.type = type;
		this.cibilScore = cibilScore;
	}
	public RequestForLoan(String applicantName, String address,	String purposeOfLoan, String specialRequests, ApplicantType type, int cibilScore, int requiredTerm) {
		super();
		this.applicantName = applicantName;
		this.address = address;
		this.purposeOfLoan = purposeOfLoan;
		this.specialRequests = specialRequests;
		this.type = type;
		this.cibilScore = cibilScore;
		this.requiredTerm = requiredTerm;
	}
	
	
	

}
