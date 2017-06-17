package Problem1.bridge.factory;

import Problem1.bridge.BSETradeImplementor;
import Problem1.bridge.TradeImplementor;

public class BSETradeImplementorFactoryImpl extends TradeImplementorFactory {

	@Override
	public TradeImplementor createTradeImplementor() {
		
		return new BSETradeImplementor();
	}

}
