package Problem4.state;

public class AssignedBugReportState extends BugReportState {

	@Override
	public void resolveBug(BugReport bugReport, String bugSolution) {
		bugReport.setBugSolution(bugSolution);
		bugReport.setCurrentState(BugReport.RESOLVED);
	}

}
