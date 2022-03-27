package firsttime;

interface Animal {
	
void walk();
}

class Horse implements Animal {
public void walk() {
System.out.println("Horse walks on 4 legs");
}

}

class Chicken implements Animal {
public void walk() {
System.out.println("Chicken walks on 2 legs");
}
}

public class interfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken sorav=new Chicken();
		Horse sorav1=new Horse();
		//sorav.walk();
		sorav1.walk();

	}

}
