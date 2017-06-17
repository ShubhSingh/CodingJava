package Problem1.bridge;

import java.math.BigDecimal;

public class FinancedTrade extends Trade {
	
	String approvingManagerId;

	public FinancedTrade() {
		super();
		super.getClient().
		setBrokerCommissionRate(
				super.getClient().getBrokerCommissionRate().
				multiply(new BigDecimal(2)));
	}
	
	

}
