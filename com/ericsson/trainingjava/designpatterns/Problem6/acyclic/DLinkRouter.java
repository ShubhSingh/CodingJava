package Problem6.acyclic;


public class DLinkRouter implements Router{

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}

	@Override
	public void accept(RouterAcyclicVisitor v) {
		
		DLinkVisitor dLinkVisitor = (DLinkVisitor)v;
		dLinkVisitor.visit(this);
	}

}
