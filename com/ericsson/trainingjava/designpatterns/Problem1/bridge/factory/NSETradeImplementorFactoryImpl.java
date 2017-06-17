package Problem1.bridge.factory;

import Problem1.bridge.NSETradeImplementor;
import Problem1.bridge.TradeImplementor;

public class NSETradeImplementorFactoryImpl extends TradeImplementorFactory {

	@Override
	public TradeImplementor createTradeImplementor() {
		
		return new NSETradeImplementor();
	}

}
