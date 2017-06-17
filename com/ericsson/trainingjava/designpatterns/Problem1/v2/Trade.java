package Problem1.v2;

import java.math.BigDecimal;

public abstract class Trade {
	protected int id;
	protected String stockName;
	protected int quantity;
	protected BigDecimal price;
	protected boolean sell; // true=sell and false=buy
	protected Client client;
	protected String brokerCode;
	
	//Setter and Getters Follow
	
	public abstract Object toStockExchangeFormat();
	
}
