class Overloading{
	static void add(int a,int b){
		System.out.println( " Int add function called ");
	}
	static void add(double a, double b){
		System.out.println( " Double add function called ");
	}
	public static void main(String args[]){
		int a = 2, b = 3;
		double c = 2.2, d = 3.3;
		add(a,b);
		add(c,d);
	}
}