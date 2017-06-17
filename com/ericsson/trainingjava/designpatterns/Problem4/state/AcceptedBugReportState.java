package Problem4.state;

public class AcceptedBugReportState extends BugReportState {
	
	@Override
	public void assignToDeveloper(BugReport bugReport,
			String assignedDeveloperName) {
		bugReport.setAssignedDeveloperName(assignedDeveloperName);
		bugReport.setCurrentState(BugReport.ASSIGNED);
		
	}

}
