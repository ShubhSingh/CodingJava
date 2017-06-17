package Problem1.v2;

import java.math.BigDecimal;

public class FinancedNSETrade extends NSETrade {

	String approvingManagerId;
	//setter and getter for it follows
	
	public FinancedNSETrade(){
		BigDecimal commissionRate=super.client.getBrokerCommissionRate();
		super.client.setBrokerCommissionRate(commissionRate.multiply(new BigDecimal(2)));
		
	}
}
