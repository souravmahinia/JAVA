package firsttime;
class A{
	int a=25;
}
class B extends A{
	int a=67;
	void show(int a) {
	System.out.println(a);
	System.out.println(this.a);//refer current class(B) variable
	System.out.println(super.a);//refer parent class(A) variable
}
}

public class superkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B sorav=new B();
		sorav.show(77);//simple pass argument
		
		

	}

}
