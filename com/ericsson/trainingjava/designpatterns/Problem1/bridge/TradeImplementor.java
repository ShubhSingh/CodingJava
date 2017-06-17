package Problem1.bridge;

import java.math.BigDecimal;

import Problem1.v1.Client;

public abstract class TradeImplementor {
	
	protected int id;
	protected String stockName;
	protected int quantity;
	protected BigDecimal price;
	protected boolean sell; // true=sell and false=buy
	protected Client client = new Client();
	protected String brokerCode;
	
	
	
	public abstract Object toStockExchangeFormat();



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStockName() {
		return stockName;
	}



	public void setStockName(String stockName) {
		this.stockName = stockName;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public boolean isSell() {
		return sell;
	}



	public void setSell(boolean sell) {
		this.sell = sell;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public String getBrokerCode() {
		return brokerCode;
	}



	public void setBrokerCode(String brokerCode) {
		this.brokerCode = brokerCode;
	}



		
	

	

}
