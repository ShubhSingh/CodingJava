package Problem4.state;

public class ReportedBugReportState extends BugReportState {
	
	@Override
	public void reportBug(BugReport bugReport, String bugDescription) {
		bugReport.setBugDescription(bugDescription);
	}
	
	@Override
	public void acceptBugReport(BugReport bugReport) {
		bugReport.setCurrentState(BugReport.ACCEPTED);
	}

}
