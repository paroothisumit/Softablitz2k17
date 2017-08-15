class InvalidOverloading{
	public int fun(int a){
		return a;
	}

	public double fun(int a){
		return 1.0;
	}

	public static void main(String args[]){
		Demo d = new Demo();
		int x = d.fun(1);
		double y = d.fun(3);

		System.out.println("x : "+x+" y: "+y);
	}
}
