package Problem4.state;

public class TestState {
	public static void main(String[] args) {
		BugReport report = new BugReport();
		report.reportBug("mouse not working!");
		report.reportBug("mouse not working again!");
		report.acceptBugReport();
		report.assignBugToDeveloper("self");
		report.resolveBug("connect");
		report.acceptBugReport();
	}

}
