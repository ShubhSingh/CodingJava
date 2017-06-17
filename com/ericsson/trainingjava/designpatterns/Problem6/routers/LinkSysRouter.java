package Problem6.routers;

import Problem6.visitor.RouterVisitor;

public class LinkSysRouter implements Router{

	@Override
	public void sendData(char[] data) {
	}

	@Override
	public void acceptData(char[] data) {
	}
	
	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}

}

