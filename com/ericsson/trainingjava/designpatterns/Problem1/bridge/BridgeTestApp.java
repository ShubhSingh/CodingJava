package Problem1.bridge;

import java.math.BigDecimal;

import Problem1.v1.Client;

public class BridgeTestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Client client = new Client();
		client.setBrokerCommissionRate(new BigDecimal(1.5));
		
		CashTrade cashTrade = new CashTrade();
		cashTrade.setClient(client);
		System.out.println(cashTrade.toStockExchangeFormat());
		FinancedTrade financedTrade = new FinancedTrade();
		financedTrade.setClient(client);
		System.out.println(financedTrade.getClient().getBrokerCommissionRate());
	}

}
