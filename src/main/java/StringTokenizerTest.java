package main.java;

public class StringTokenizerTest {

	public static void main (String[] args) {
	String code = null;
	String desc = null;
	
	String[] relDescArray = new String[2];
	
	relDescArray[0] = "WAGLE MANOHAR & FLY" + "~!~" + "124";
	relDescArray[1] = "KIRPALANI PRAKASH & FLY" + "~!~" + "125";
	
	String sArr[]=null;
	
	for (int i=0; i<relDescArray.length; i++) {
		sArr=relDescArray[i].split("~!~");
	//for(String token : sArr) {
	System.out.println(sArr[0] + " *** " + sArr[1]);
	//desc=token;
	//System.out.println(desc);
	//}
	
	desc=sArr[0];
	code=sArr[1];
	System.out.println("desc "+desc);
	System.out.println("code "+code);
	}
	
	//String sText = "WAGLE MANOHAR & FLY~!~124";
	
	//for(String sT : sArr ) {
		//	System.out.println(" T1 " + sT);
		//}
	
	// for (int i=0; i<1; i++) 
	// {
		
		// st = new StringTokenizer("WAGLE MANOHAR & FLY^124", "^");
					
		// try
		// {
			// desc = st.nextToken();
			// code = st.nextToken();
		// }
		// catch (Exception ex)
		// {
			// ex.printStackTrace();
			// code = "";
			// desc = "";
		// }				
	// System.out.println(desc);
	// System.out.println(code);
			// }
	}
}