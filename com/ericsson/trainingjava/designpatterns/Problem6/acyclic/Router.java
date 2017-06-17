package Problem6.acyclic;

import Problem6.visitor.RouterVisitor;

public interface Router 
{
	public void sendData(char[] data);
	public void acceptData(char[] data);
	
	public void accept(RouterAcyclicVisitor v);
}
