package Problem4.state;

public class BugReportState {

	public void acceptBugReport(BugReport bugReport) {
		throw new IllegalStateException("acceptBugReport not applicaple in currentState");
		
	}

	public void assignToDeveloper(BugReport bugReport,
			String assignedDeveloperName) {
		throw new IllegalStateException("assignToDeveloper not applicaple in currentState");
		
	}

	public void resolveBug(BugReport bugReport, String bugSolution) {
		throw new IllegalStateException("resolveBug not applicaple in currentState");
		
	}

	public void reportBug(BugReport bugReport, String bugDescription) {
		throw new IllegalStateException("reportBug not applicaple in currentState");
		
	}

	
}
