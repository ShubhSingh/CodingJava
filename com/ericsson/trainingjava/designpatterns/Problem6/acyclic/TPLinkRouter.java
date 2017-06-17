package Problem6.acyclic;

import Problem6.visitor.RouterVisitor;

public class TPLinkRouter implements Router{

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}
	
	@Override
	public void accept(RouterAcyclicVisitor v) {
		TPLinkVisitor tpLinkVisitor = (TPLinkVisitor)v;
		
		tpLinkVisitor.visit(this);
	}
}
