class SwapPrimitive{
	static void swap( int x, int y){
		int tmp = x;
		x = y;
		y = tmp;
	}
	public static void main(String args[]){
		int a = 2, b = 3;
		swap( a, b);
		System.out.println( " a value is -> " + a + " b value is -> " + b);
	}
}