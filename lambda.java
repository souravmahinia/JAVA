package firsttime;
@FunctionalInterface
interface asaan
{
	public void sourav(int a);
	//not allowed method body
		//System.out.println(a);
	
}

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asaan sorav=(a)->{System.out.println("i am from lambda function==" + a);};
		sorav.sourav(6);
		
		

	}

}
