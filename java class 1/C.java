// Each source can contain only one public class 
// Source file name has to be the name of that public class
class A{
	public int a;
}

class B{
	int b;
}

public class C{
	public static void main(String args[]){
		A a = new A();
		System.out.println("Class C has main");
	}
}
