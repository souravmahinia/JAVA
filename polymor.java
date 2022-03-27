package firsttime;
class Student2 {
String name;
int age;

public void displayInfo(String name) {
System.out.println(name);
}

public void displayInfo(int age) {
System.out.println(age);
}
public void displayInfo(String name,int age) {
System.out.println(name);
}
}
public class polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 sorav=new Student2();
		//sorav.name="mahinia";//value put in argument of method
		sorav.displayInfo("sorav");
		sorav.displayInfo(23);
		sorav.displayInfo("sorav",23);
		
		

	}

}
