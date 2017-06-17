package Problem4.state;

public class BugReport {
	
	static final BugReportState REPORTED = new ReportedBugReportState();
	static final BugReportState ACCEPTED = new AcceptedBugReportState();
	static final BugReportState ASSIGNED = new AssignedBugReportState();
	static final BugReportState RESOLVED = new ResolvedBugReportState();
	
	private BugReportState currentState = REPORTED;

	public BugReportState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(BugReportState currentState) {
		this.currentState = currentState;
	}
	
	public void reportBug(String bugDescription){
		
		currentState.reportBug(this,bugDescription);
		
		/*if(currentStatus == null){
			currentStatus = REPORTED;
			this.bugDescription = bugDescription;
		}else if(currentStatus.equalsIgnoreCase(REPORTED)){
			this.bugDescription = bugDescription;
		}else if(currentStatus.equalsIgnoreCase(ACCEPTED)){
			System.out.println("You can not change description after it's accepted!");
		}else if(currentStatus.equalsIgnoreCase(ASSIGNED)){
			System.out.println("You can not change description after it's assigned!");
		}else if(currentStatus.equalsIgnoreCase(RESOLVED)){
			System.out.println("You can not change description after it's resolved!");
		}*/
		
	}
	public void acceptBugReport(){
		currentState.acceptBugReport(this);
		
		/*if(currentStatus == null){
			System.out.println("You have to report the bug before it can be accepted!");
		}else if(currentStatus.equalsIgnoreCase(REPORTED)){
			currentStatus = ACCEPTED;
		}else if(currentStatus.equalsIgnoreCase(ACCEPTED)){
			System.out.println("This bug is already accepted!");
		}else if(currentStatus.equalsIgnoreCase(ASSIGNED)){
			System.out.println("You can not accept a bug after it's assigned!");
		}else if(currentStatus.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved!");
		}*/
	}
	public void assignBugToDeveloper(String assignedDeveloperName){
		
		currentState.assignToDeveloper(this,assignedDeveloperName);
		/*if(currentStatus == null){
			System.out.println("You have to report the bug and be accepted before it's assigned!");
		}else if(currentStatus.equalsIgnoreCase(REPORTED)){
			System.out.println("It must be accepted before it can be assigned");
		}else if(currentStatus.equalsIgnoreCase(ACCEPTED)){
			currentStatus = ASSIGNED;
			this.assignedDeveloperName = assignedDeveloperName;
		}else if(currentStatus.equalsIgnoreCase(ASSIGNED)){
			System.out.println("it's already assigned!");
		}else if(currentStatus.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved!");
		}*/
	}
	public void resolveBug(String bugSolution){
		
		currentState.resolveBug(this,bugSolution);
		/*if(currentStatus == null){
			System.out.println("You have to report the bug and be accepted before it's assigned or resolved!");
		}else if(currentStatus.equalsIgnoreCase(REPORTED)){
			System.out.println("It must be accepted before it can be resolved!");
		}else if(currentStatus.equalsIgnoreCase(ACCEPTED)){
			System.out.println("The bug must be assigned to a developer first!");
		}else if(currentStatus.equalsIgnoreCase(ASSIGNED)){
			currentStatus = RESOLVED;
			this.bugSolution = bugSolution;
		}else if(currentStatus.equalsIgnoreCase(RESOLVED)){
			System.out.println("This bug already resolved you can't resolve again!");
		}*/
	}
	
	String bugDescription,assignedDeveloperName,bugSolution;

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public String getAssignedDeveloperName() {
		return assignedDeveloperName;
	}

	public void setAssignedDeveloperName(String assignedDeveloperName) {
		this.assignedDeveloperName = assignedDeveloperName;
	}

	public String getBugSolution() {
		return bugSolution;
	}

	public void setBugSolution(String bugSolution) {
		this.bugSolution = bugSolution;
	}
	
}
