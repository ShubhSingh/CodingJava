package Problem1.v1;

public class BSETrade extends Trade {

	@Override
	public Object toStockExchangeFormat() {
		Object dataInBSEFormat="All:data:goes:like:this";
		return dataInBSEFormat;
	}

}
