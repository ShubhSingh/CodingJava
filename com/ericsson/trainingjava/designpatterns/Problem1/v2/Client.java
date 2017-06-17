package Problem1.v2;

import java.math.BigDecimal;

public class Client {
	String id;
	String name;
	String address;
	BigDecimal exposureLimit;
	BigDecimal brokerCommissionRate;
	//Setter Getters Follow
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getExposureLimit() {
		return exposureLimit;
	}
	public void setExposureLimit(BigDecimal exposureLimit) {
		this.exposureLimit = exposureLimit;
	}
	public BigDecimal getBrokerCommissionRate() {
		return brokerCommissionRate;
	}
	public void setBrokerCommissionRate(BigDecimal brokerCommissionRate) {
		this.brokerCommissionRate = brokerCommissionRate;
	}
}
