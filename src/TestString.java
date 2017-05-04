class TestString {
	public static void main(String[] s) 
	{
		String s1 = new String("ABCDEFG"), s2 = s1.substring(0,3);
		String s3 = s1.substring(4,6); 
		char c1 = s1.charAt(3);
		System.out.println(s2.concat(String.valueOf(c1)).concat(s3));
	}
}
