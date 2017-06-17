package compilationerrors;


class Assignment {
	public static void main(String[] args) {
		byte b = 3;
		b *=2; // b gets converted to int here
		b = b*2; // Type mismatch: cannot convert from int to byte
		System.out.println(b);
	}
}