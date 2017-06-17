package Problem6.visitor;

import Problem6.routers.DLinkRouter;
import Problem6.routers.LinkSysRouter;
import Problem6.routers.TPLinkRouter;

public interface RouterVisitor {
	public void visit(DLinkRouter router);
	public void visit(TPLinkRouter router);
	public void visit(LinkSysRouter router);
}
