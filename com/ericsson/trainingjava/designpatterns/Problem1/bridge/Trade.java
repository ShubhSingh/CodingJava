package Problem1.bridge;

import java.math.BigDecimal;

import Problem1.bridge.factory.TradeImplementorFactory;
import Problem1.v1.Client;

public abstract class Trade {
	
	private TradeImplementor  implementor;

	public Trade() {
		super();
		TradeImplementorFactory factory = 
				TradeImplementorFactory.newInstance();
		implementor = factory.createTradeImplementor();
	}

	public Object toStockExchangeFormat() {
		return implementor.toStockExchangeFormat();
	}

	public int getId() {
		return implementor.getId();
	}

	public void setId(int id) {
		implementor.setId(id);
	}

	public String getStockName() {
		return implementor.getStockName();
	}

	public void setStockName(String stockName) {
		implementor.setStockName(stockName);
	}

	public int getQuantity() {
		return implementor.getQuantity();
	}

	public void setQuantity(int quantity) {
		implementor.setQuantity(quantity);
	}

	public BigDecimal getPrice() {
		return implementor.getPrice();
	}

	public void setPrice(BigDecimal price) {
		implementor.setPrice(price);
	}

	public boolean isSell() {
		return implementor.isSell();
	}

	public void setSell(boolean sell) {
		implementor.setSell(sell);
	}

	public Client getClient() {
		return implementor.getClient();
	}

	public void setClient(Client client) {
		implementor.setClient(client);
	}

	public String getBrokerCode() {
		return implementor.getBrokerCode();
	}

	public void setBrokerCode(String brokerCode) {
		implementor.setBrokerCode(brokerCode);
	}
	
	
	
	

}
