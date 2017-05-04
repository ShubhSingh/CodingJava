class MyException {
	public static void main(String[] args) {
		MyException myEx = new MyException();
		try {
			myEx.checkFood(args[0]);
		}
		catch(BadFoodException e) {
			e.printStackTrace();
		}
	}
	void checkFood(String foodType) throws BadFoodException {
		if(foodType.equals("mango")) {
			System.out.println("I love it.");
		}
		else {
			throw new BadFoodException();
		}
	}
}
class BadFoodException extends Exception {

}