package Problem1.bridge;

public class BSETradeImplementor extends TradeImplementor {

	@Override
	public Object toStockExchangeFormat() {
		Object dataInBSEFormat="All:data:goes:like:this";
		return dataInBSEFormat;

	}

}
