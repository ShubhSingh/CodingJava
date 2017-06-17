package Problem1.v2;

public class NSETrade extends Trade {

	@Override
	public Object toStockExchangeFormat() {
		Object dataInNSEFormat="<trade>All data goes like this</trade>";
		return dataInNSEFormat;
	}

}
