package firsttime;
class Student{
	
	String name;
	int age;
	//Student() {
	//	System.out.println("Constructor called");//constructor always run first
	//}
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		}
	public void getInfo() {
	System.out.println("The name of this Student is " +this.name);
	System.out.println("The age of this Student is " + this.age);
	}
	
}

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("sorav mahinia",66);
//		s1.name = "Aman";
//		s1.age = 24;
		s1.getInfo();
//		Student s2 = new Student();
//		s2.name = "Shradha";
//		s2.age = 25;
//		s2.getInfo();

	}

}
