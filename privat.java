package firsttime;
class data{
	private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
public class privat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data sorav=new data();
		//sorav.account="mahinia";// error due to account is private
		sorav.setAccount("mahiniasorav332@");
		System.out.println(sorav.getAccount());
		
		
		

	}

}
