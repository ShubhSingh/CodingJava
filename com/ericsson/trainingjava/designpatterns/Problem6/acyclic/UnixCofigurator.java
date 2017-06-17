package Problem6.acyclic;

public class UnixCofigurator implements DLinkVisitor,SysLinkVisitor,TPLinkVisitor {

	@Override
	public void visit(TPLinkRouter r) {
		System.out.println("Configuring TP for unix");
		
	}

	@Override
	public void visit(LinkSysRouter r) {
		System.out.println("Configuring LS for unix");
		
	}

	@Override
	public void visit(DLinkRouter r) {
		System.out.println("Configuring DL for unix");
		
	}

}
