public class Problem2 {

	/**
	 * You are driving a little too fast, and a police officer stops you.
	 * Write code to compute the fine you would have to pay.
	 * If your speed is 60 or less, the result is 0 since there is no fine.
	 * If speed is between 61 and 80 inclusive, the fine is 100 dollars.
	 * If speed is 81 or more, the result is 200.
	 * Unless it is a holiday -- on that day, your speed can be 5 higher in all cases. <br>
	 * <br>
	 *
	 * <b>EXPECTATIONS:</b><br>
		speedingFine(60, false)  <b>---></b> 0 <br>
		speedingFine (65, false)   <b>---></b> 100 <br>
		speedingFine (65, true) <b>---></b> 0 <br>
	 */
		public static int speedingFine(int speed, boolean isHoliday) {
      if (isHoliday) {
        if(speed > 65 && speed <= 85) {
          return 100;
        } else if (speed > 85) {
          return 200;
        }
        return 0;
      } else {
        if(speed > 60 && speed <= 80) {
          return 100;
        } else if (speed > 80) {
          return 200;
        }
        return 0;
      }
		}


	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
		public static void main(String args[]){
			Problem2Test.runTests();
		}

		static class Problem2Test {
      public static void runTests(){


        int [] params1 = {60,65,65,80,85,85,70,75,75,40,40,90};

        boolean[] params2 = { false, false, true, false, false, true, false, false, true, false, true, false };

        int[] expected = { 0, 100, 0, 100, 200, 100, 100, 100, 100, 0, 0, 200 };

        for(int i=0; i < params1.length; i++){
          int result = Problem2.speedingFine(params1[i], params2[i]);
          if(result == expected[i]) {
            System.out.println(printPassResult(params1[i], params2[i], expected[i], result));
          } else{
            System.out.println(printFailResult(params1[i], params2[i], expected[i], result));
          }
        }
      }

      private static String printPassResult(Object params1, Object params2, Object expected, Object result){
        return "PASS: speedingFine("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString();
      }


      private static String printFailResult(Object params1, Object params2, Object expected, Object result){
        String ret = "**********************" + "\n";
        ret += "FAIL: speedingFine("+ params1.toString()+ ", "+ params2.toString()+ ") -> " + result.toString()
        + "      Expected: "+ expected.toString();
        ret += "\n" + "**********************";
        return ret;
      }
    }
}

