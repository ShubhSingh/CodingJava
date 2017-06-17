package Problem3.v1;

import java.util.ArrayList;

public class AdditionCountingArrayList extends ArrayList {
	private int count = 0;
	@Override
	public boolean add(Object o){
		count++;
		return super.add(o);
	}

}
