package Problem6;

import junit.framework.TestCase;

import Problem6.configurators.LinuxConfigurator;
import Problem6.configurators.MacConfigurator;
import Problem6.routers.DLinkRouter;
import Problem6.routers.LinkSysRouter;
import Problem6.routers.Router;
import Problem6.routers.TPLinkRouter;

public class TestVisitorPattern extends TestCase
{
	private MacConfigurator macConfigurator;
	private LinuxConfigurator linuxConfigurator;
	private Router dlink;
	private Router tplink;
	private Router linksys;
	
	public void setUp()
	{
		macConfigurator = new MacConfigurator();
		linuxConfigurator = new LinuxConfigurator();
		
		dlink = new DLinkRouter();
		tplink = new TPLinkRouter();
		linksys = new LinkSysRouter();
	}
	
	public void testDlink()
	{
		dlink.accept(macConfigurator);
		dlink.accept(linuxConfigurator);
	}
	
	public void testTPLink()
	{
		tplink.accept(macConfigurator);
		tplink.accept(linuxConfigurator);
	}
	
	public void testLinkSys()
	{
		linksys.accept(macConfigurator);
		linksys.accept(linuxConfigurator);
	}
	
	/*public void test1(Router r){
		macConfigurator.visit(r);
	}*/
	
}
