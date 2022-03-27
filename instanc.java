package firsttime;


class variable{
	int a=13;//instance vaiable as outside from method..
	
	public void local() {
		
		int b=15;
	    System.out.println("local variabel is" + b);
	    System.out.println("instance variabel is" + a);
	}
	
}
public class instanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=77;
		//local varible run without any object creation
		 System.out.println("local variabel is" + c); 
		variable sorav=new variable();
		sorav.local();

	}

}
