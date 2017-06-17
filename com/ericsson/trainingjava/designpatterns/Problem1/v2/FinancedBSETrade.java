package Problem1.v2;

import java.math.BigDecimal;

public class FinancedBSETrade extends BSETrade {
	
	String approvingManagerId;
	//setter and getter for it follows
	
	public FinancedBSETrade(){
		BigDecimal commissionRate=super.client.getBrokerCommissionRate();
		super.client.setBrokerCommissionRate(commissionRate.multiply(new BigDecimal(2)));
		
	}
	

}
