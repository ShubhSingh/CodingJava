public class Problem1 {
	
	/**
	Problem Category: Easy
 	Given a string of odd length, return the middle 3 characters from the string,
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		String result = str;

		if(str.length()>=3) {
			int mid = str.length()/2;
			result = str.substring(mid-1, mid+2);
			return result;
		}

		return result;
	}
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		Problem1Test.runTests();
	}

	/**
	 * In below inner class are the test fixtures setup to test various
	 * test cases, the objective of above problem's solution is to make
	 * these test cases PASS.
	 * */
	public static class Problem1Test {
		public static void runTests(){

			String [] params1 = {"12345","apple","tiger","candy","add","ad","a","","del","denny","sfveaadelbb"};
			String  [] expected = {"234","ppl","ige","and","add","ad","a","","del","enn","aad"};

			for(int i=0; i < params1.length; i++){
				String result = middleThree(params1[i]);
				if(result.equals(expected[i])) {
					System.out.println(printPassResult(params1[i], result));
				} else{
					System.out.println(printFailResult(params1[i], expected[i], result));
				}
			}
		}

		private static String printPassResult(Object params1, Object result){
			return "PASS: middleThree("+ params1.toString()+ ") -> " + result.toString();
		}


		private static String printFailResult(Object params1, Object expected, Object result){
			String ret = "**********************" + "\n";
			ret += "FAIL: middleThree("+ params1.toString()+ ") -> " + result.toString()
			+ "      Expected: "+ expected.toString();
			ret += "\n" + "**********************";
			return ret;
		}
	}
}
